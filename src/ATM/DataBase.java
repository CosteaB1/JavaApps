package ATM;

import java.sql.*;


public class DataBase {
    public void connectionDB() {
        Connection conn1 = null;

        try {
            // connect way #1
            String url1 = "jdbc:mysql://127.0.0.1:3306/ebookshop?useSSL=false";
            String user = "root";
            String password = "fucklife";

            conn1 = DriverManager.getConnection(url1, user, password);
            Statement stmt = conn1.createStatement();
            checkLogin(stmt);
            if (conn1 != null) {
                System.out.println("Connected to the database ebookshop: " + url1 + " username:" + user);
            }
        } catch (SQLException e) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            e.printStackTrace();
        }
    }


    public void checkLogin(Statement stmt) throws SQLException {

        String strSelect = "SELECT userName, pass FROM users";
        System.out.println("The SQL statement is: " + strSelect + "\n");
        ResultSet rset = stmt.executeQuery(strSelect);

        while(rset.next()) {
            String username_1 = rset.getString("userName");
            String pass_1 = rset.getString("pass");
            System.out.println(username_1 + ", " + pass_1);

        }

    }


}
