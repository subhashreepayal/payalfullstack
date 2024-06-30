import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
class createdatabase{
    public static void main(String[] args) {
        try{
            String url ="jdbc:mysql://localhost:3308/";
            Connection con =DriverManager.getConnection(url,"root","");
            Statement stmt=con.createStatement();
            stmt.execute("create database demo");
            System.out.println("success");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}