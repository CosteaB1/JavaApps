package DataBaseWork;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlSelect extends JbdcSelectTest {

    public void getData(Statement stmt) throws SQLException {
        String strSelect = "select title, price, qty from books";
        System.out.println("The SQL statement is: " + strSelect + "\n");
        ResultSet rset = stmt.executeQuery(strSelect);
        System.out.println("The recrods selected are: ");
        int rowCount = 0;
        while (rset.next()) {
            String title = rset.getString("title");
            double price = rset.getDouble("price");
            int qty = rset.getInt("qty");
            System.out.println(title + ", " + price + ", " + qty);
            ++rowCount;
        }
        System.out.println("Total number of records = " + rowCount);
    }

    public void selectData(Statement stmt) throws SQLException {
        String strUpdate = " update books set price = price*0.7, qty= qty+1 where id = 1001";
        System.out.println("\nThe SQL statement is: " + strUpdate + "\n");
        int contUpdate = stmt.executeUpdate(strUpdate);
        System.out.println(contUpdate + " records affected. \n");
        String strSelect = "select * from books where id = 1001";
        System.out.println("The SQL statement is: " + strSelect + "\n");  // Echo for debugging
        ResultSet rset = stmt.executeQuery(strSelect);
        while (rset.next()) {   // Move the cursor to the next row
            System.out.println(rset.getInt("id") + ", "
                    + rset.getString("author") + ", "
                    + rset.getString("title") + ", "
                    + rset.getDouble("price") + ", "
                    + rset.getInt("qty"));
        }

    }

    public void delete(Statement stmt) throws SQLException {
        String sqlDelete = "delete from books where id >= 3000 and id <4000";
        int countDeleted = stmt.executeUpdate(sqlDelete);
        System.out.println(countDeleted + " records deleted");

    }

    public void insert(Statement stmt) throws SQLException {
        // INSERT a record
        String sqlInsert = "insert into books values (3001, 'Gone Fishing', 'Kumar', 11.11, 11)";
        System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
        int countInserted = stmt.executeUpdate(sqlInsert);
        System.out.println(countInserted + " records inserted.\n");

        // INSERT multiple records
        sqlInsert = "insert into books values "
                + "(3002, 'Gone Fishing 2', 'Kumar', 22.22, 22),"
                + "(3003, 'Gone Fishing 3', 'Kumar', 33.33, 33)";
        System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
        countInserted = stmt.executeUpdate(sqlInsert);
        System.out.println(countInserted + " records inserted.\n");

        String strSelect = "select * from books";
        System.out.println("The SQL statement is: " + strSelect + "\n");  // Echo For debugging
        ResultSet rset = stmt.executeQuery(strSelect);
        while (rset.next()) {   // Move the cursor to the next row
            System.out.println(rset.getInt("id") + ", "
                    + rset.getString("author") + ", "
                    + rset.getString("title") + ", "
                    + rset.getDouble("price") + ", "
                    + rset.getInt("qty"));
        }

    }
}
