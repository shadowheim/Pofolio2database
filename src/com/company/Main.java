package com.company;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the students id you want grade average on? ");
        int studentID = scanner.nextInt();

        Connection conn;
        String sqlite = "jdbc:sqlite:database/pofolio2database.dbsqlite";

        try {
            conn = DriverManager.getConnection(sqlite);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM Student where ID ="+studentID;
            ResultSet res = stmt.executeQuery(query);
            System.out.println(res.getString("Name") + " got " + res.getInt("grade") + " in " + res.getString("Course"));
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
