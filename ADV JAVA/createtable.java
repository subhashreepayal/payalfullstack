import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createtable {
     public static void main(String[] args) {
        try{
            String url ="jdbc:mysql://localhost:3308/demo";
            Connection con =DriverManager.getConnection(url,"root","");
            Statement stmt=con.createStatement();
            stmt.execute("create table demo(id int,name varchar(20))");
            System.out.println("success");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
