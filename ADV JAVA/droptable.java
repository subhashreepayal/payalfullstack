import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class droptable {
     public static void main(String[] args) {
        try{
            String url ="jdbc:mysql://localhost:3308/demo";
            Connection con =DriverManager.getConnection(url,"root","");
            Statement stmt=con.createStatement();
            String tableName = "emp3";

            // Drop table
            String dropTableQuery = "DROP TABLE IF EXISTS " + tableName;
            stmt.executeUpdate(dropTableQuery);
            System.out.println("Table dropped successfully.");

        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
