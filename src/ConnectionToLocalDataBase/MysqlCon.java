package ConnectionToLocalDataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MysqlCon {
    // Need to add jdbc External Libraries
    public static void main(String[] args) {
        Connection conn1 = null;
        Connection conn2 = null;
        Connection conn3 = null;
        try {

            // connect way #1
            String url1 = "jdbc:mysql://127.0.0.1:3306/ebookshop?useSSL=false";
            String user = "root";
            String password = "fucklife";

            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database test1");
            }

            // connect way #2
            String url2 = "jdbc:mysql://localhost:3306/ebookshop?user=root&password=fucklife&useSSL=false";
            conn2 = DriverManager.getConnection(url2);
            if (conn2 != null) {
                System.out.println("Connected to the database test2");
            }

            // connect way #3
            String url3 = "jdbc:mysql://localhost:3306/ebookshop?useSSL=false";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "fucklife");

            conn3 = DriverManager.getConnection(url3, info);
            if (conn3 != null) {
                System.out.println("Connected to the database test3");
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace(); }
//        } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
    }
}