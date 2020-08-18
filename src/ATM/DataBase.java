package ATM;

import java.sql.*;
import java.util.Scanner;


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
            if (conn1 != null) {
                System.out.println("Connected to the database ebookshop: " + url1 + " username:" + user);
            }

            checkLogin(stmt);

        } catch (SQLException e) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            e.printStackTrace();
        }
    }


    public void checkLogin(Statement stmt) throws SQLException {
        String[] username_1 = new String[10];
        String[] pass_1 = new String[10];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String username = keyboard.nextLine();
        System.out.println("Enter Pass: ");
        String pass = keyboard.nextLine();

        String strSelect = "SELECT * FROM users";
//        System.out.println("The SQL statement is: " + strSelect + "\n");
        ResultSet rset = stmt.executeQuery(strSelect);
        for (int i = 0; i < 3; i++) {
            if (rset.next()) {
                username_1[i] = rset.getString("userName");
                pass_1[i] = rset.getString("pass");
//                System.out.println(username_1[i] + " " + pass_1[i]);
            }
        }
        for (int i = 0; i < 3; i++) {
            if (username.equals(username_1[i]) && pass.equals(pass_1[i])) {
                System.out.println("Login Successfully");
                break;
            }
        }

//        for (int i = 0; i < 3; i++) {
//            if (!username.equals(username_1[i]) || !pass.equals(pass_1[i])) {
//                System.out.println("Login or password is incorrect");
//            }
//        }
    }


//        for (int i = 0; i < 3; i++) {
//        while (rset.getString(int j)) {
//                username_1[i] = rset.getString("userName");
//                pass_1[i] = rset.getString("pass");
//                System.out.println(username_1[i] + " " + pass_1[i]);
//            }
//
//        }

//        for (int i = 0; i < 1; i++) {
//            if (username.equals(username_1[i]) && (pass.equals(pass_1[i]))) {
//                System.out.println("Login Successfully");
//            } else {
//                System.out.println("Login or password is incorrect");
//            }
//        }


}



