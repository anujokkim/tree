package com.codefromscratch.httpserver.util;

import java.sql.*;

 public class db {
    public static void main(String[] args) {
        try {
            insert();
            read();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void read() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "postgres";
        String query = "SELECT * FROM jokim";


        Connection conn = DriverManager.getConnection(url, user, password);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            String address = rs.getString("address");
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Address: " + address);
        }


        rs.close();
        st.close();
        conn.close();
    }

    public static void insert()throws Exception {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "postgres";
        String query = "insert into jokim values(9,'rino',30,'milapoor')";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement st = conn.createStatement();
        int rows = st.executeUpdate(query);

        System.out.println("number of row affected" + rows);
        conn.close();
    }
}
