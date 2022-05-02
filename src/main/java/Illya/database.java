package Illya;

import com.sun.tools.javac.Main;

import java.sql.*;
import java.util.logging.*;
import java.sql.Statement;

public class database {


    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {


        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String userName = "root";
            String password = "illya46";
            String url = "jdbc:MySQL://localhost/languages";
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Database connected ");
        } catch (Exception ex) {
            System.err.println("Cannot connect to database server");
            ex.printStackTrace();
        }

        // get values from database

        Statement st = conn.createStatement();
        System.out.println("PHP2");
        String sql = ("SELECT * FROM `languages` LIMIT 50");
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()) {
            System.out.println(rs.getString("PHP3"));


        }

        // insert valuers to database
String query = ("INSERT INTO languages + values(?,?,?,?,?)");
        PreparedStatement preparedstmt = conn.prepareStatement(query);
        preparedstmt.setString(1,"REREW");
        preparedstmt.setString(2,"rerwrwrwrwr");
        preparedstmt.setString(3,"fdsfsdfe");
        preparedstmt.setString(4,"fdsfsfsfsfwwwrw");



    }

}





