package Jdbc;

import java.sql.*;

public class JdbcDemo {

    private static final String URL = "jdbc:mysql://localhost:3306/college";
    private static final String USER = "root";
    private static final String PASSWORD = "test123";

    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            System.out.println("Connected to database");

            insertStudent(con, "Aayushi", 21, "aayushi@gmail.com", "Computer Science");
            readStudents(con);
            updateStudent(con, 1, "Data Science");
            deleteStudent(con, 1);
            readStudents(con);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // CREATE
    static void insertStudent(Connection con, String name, int age, String email, String major) {
        String sql = "INSERT INTO student (name, age, email, major) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, email);
            ps.setString(4, major);
            ps.executeUpdate();
            System.out.println("Student inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ
    static void readStudents(Connection con) {
        String sql = "SELECT * FROM student";

        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("Student Records:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getInt("age") + " " +
                        rs.getString("email") + " " +
                        rs.getString("major")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    static void updateStudent(Connection con, int id, String newMajor) {
        String sql = "UPDATE student SET major = ? WHERE id = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, newMajor);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Student updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    static void deleteStudent(Connection con, int id) {
        String sql = "DELETE FROM student WHERE id = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
