package btcoban2;

import java.sql.*;

public class Connec {

    public static Connection getJDBCConnection() throws SQLException {
        final String url = "jdbc:jtds:sqlserver://LAPTOP-8NH1CHAP:1433/SANPHAM;instance=SQLEXPRESS;user=sa;password=12345";

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            return DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch ( SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) throws SQLException {
        Connection connection = getJDBCConnection();
        if (connection != null) {
            System.out.println("Thanh cong");
        } else {
            System.out.println("That bai");
        }
}}

