import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class showtable {
    public static void main(String[] args) {
       try{
            String url ="jdbc:mysql://localhost:3308/college";
            Connection con =DriverManager.getConnection(url,"root","");
            Statement stmt=con.createStatement();
            ResultSet rs =stmt.executeQuery("select * from empl");
            while (rs.next()) {
                System.out.println(rs.getInt("empid") + "  |  "+rs.getString("empname"));
                System.out.println("------------------------");
            }
            System.out.println("success");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}