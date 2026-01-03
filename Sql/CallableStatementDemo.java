package Sql;

import java.sql.*;

class CallableStatementDemo {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "test123"
            );

            CallableStatement cs =
                con.prepareCall("{CALL getStudentById(?)}");

            cs.setInt(1, 1);

            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("marks")
                );
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
