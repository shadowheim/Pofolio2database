package com.company;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Press (s) to get student average, (c) or other for course ");
        try {
            GradeType type = GradeType.fromInt((char) System.in.read());

            System.out.printf("Select the ID of what you wanted printed: ");
            Scanner scanner = new Scanner(System.in);
            int selectedID = scanner.nextInt();

            Connection cnct = null;
            String sqlite = "jdbc:sqlite:database/pofolio2database.dbsqlite";

            cnct = DriverManager.getConnection(sqlite);
            Statement stmt = cnct.createStatement();
            System.out.println("The " + type.getRaw() + " has an average of " + avgGrade(selectedID, stmt,type));
            switch (type){
                case Student:
                    String query = "select GradeID, CourseID from Grades where StudentID=" + selectedID + " and Grade IS NULL";
                    ResultSet res = stmt.executeQuery(query);
                    while(res.next()) {
                        int courseID = res.getInt("CourseID");
                        String course = courseFromGrade(courseID, stmt);
                        System.out.printf("The student hasn't been graded in "+ course + " want to change that? ");
                        switch ((char) System.in.read())
                        {
                            case 'y':
                                System.out.printf("What's the new grade going to be? ");
                                int newGrade = scanner.nextInt();
                                int gradeID = res.getInt("GradeID");
                                query = "UPDATE Grades SET Grade="+newGrade+" WHERE GradeID="+gradeID;
                                stmt.executeUpdate(query);
                        }
                    }
            }
        } catch(IOException e) {
            System.out.println("I asked you to pick if you wanted the grade or the student");
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    static String courseFromGrade(int selectedID, Statement statement) throws SQLException{
        String query = "SELECT Name from Course WHERE CourseID="+ selectedID;
        try {
            ResultSet res = statement.executeQuery(query);
            return res.getString("Name");
        }catch (SQLException e) {
            throw e;
        }
    }

    static int avgGrade(int selectedID, Statement statement, GradeType type) throws SQLException {
        String query = "SELECT AVG(Grade) FROM Grades where " + type.getType() + " ="+selectedID;
        try {
            ResultSet res = statement.executeQuery(query);
            return res.getInt(1);
        }catch (SQLException e) {
            throw e;
        }
    }
}
