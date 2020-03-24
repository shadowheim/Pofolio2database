package com.company;

import javax.imageio.IIOException;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What's the students id you want grade average on? ");
        try {
            char type = (char) System.in.read();

            System.out.printf("Select the ID of what you wanted printed: ");
            Scanner scanner = new Scanner(System.in);
            int selectedID = scanner.nextInt();

            Connection cnct = null;
            String sqlite = "jdbc:sqlite:database/pofolio2database.dbsqlite";

            cnct = DriverManager.getConnection(sqlite);
            Statement stmt = cnct.createStatement();
            System.out.println("The sudent has an average of " + avgGrade(selectedID, stmt,GradeType.fromInt(type)));
        }catch(IOException e) {
            System.out.println("I asked you to pick if you wanted the grade or the student");
        } catch(SQLException e) {
            e.printStackTrace();
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
