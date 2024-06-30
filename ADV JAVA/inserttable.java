import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class inserttable {
    public static void main(String[] args) {
       try{
            String url ="jdbc:mysql://localhost:3308/haha";
            Connection con =DriverManager.getConnection(url,"root","");
            Statement stmt=con.createStatement();
            stmt.execute("insert into demo value(10,'raja')");
            System.out.println("success");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
