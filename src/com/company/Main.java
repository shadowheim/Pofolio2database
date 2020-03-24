package com.company;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     //   Scanner scanner = new Scanner(System.in);
     //   System.out.println("What's the students id you want grade average on? ");
        int studentID =1;// scanner.nextInt();

        Connection cnct = null;
        String sqlite = "jdbc:sqlite:database/pofolio2database.dbsqlite";

        try {
            cnct = DriverManager.getConnection(sqlite);
            Statement stmt = cnct.createStatement();
            String query = "SELECT AVG(Grade) FROM Grades where StudentID ="+studentID;
            ResultSet res = stmt.executeQuery(query);
            System.out.println(res.getString("Name") + " got " + res.getInt("grade") + " in " + res.getString("Course"));
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
