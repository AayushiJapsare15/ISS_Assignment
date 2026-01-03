package Sql;

import java.sql.*;

class PreparedStatementDemo {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "test123"
            );

            String sql = "INSERT INTO student (name, age, marks) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "Aayushi");
            ps.setInt(2, 21);
            ps.setInt(3, 85);

            ps.executeUpdate();
            System.out.println("Record inserted using PreparedStatement");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
