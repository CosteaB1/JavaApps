package DataBaseWork;

import java.sql.*;


public class JbdcSelectTest {
    public static void main(String[] args) {
        Connection conn1 = null;
        try {

            // connect way #1
            String url1 = "jdbc:mysql://127.0.0.1:3306/ebookshop?useSSL=false";
            String user = "root";
            String password = "fucklife";

            conn1 = DriverManager.getConnection(url1, user, password);
            Statement stmt = conn1.createStatement();
            if (conn1 != null) {
                System.out.println("Connected to the database ebookshop: " + url1 + " username:" + user);
            }

            SqlSelect test1 = new SqlSelect();
            test1.getData(stmt);
            test1.selectData(stmt);
            test1.delete(stmt);
            test1.insert(stmt);

        } catch (SQLException e) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            e.printStackTrace();
        }
        finally {
            try { conn1.close();
                System.out.println("\nConnection closed"); } catch (Exception e) { /* ignored */ }
        }
    }
}
