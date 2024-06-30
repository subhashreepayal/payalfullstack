import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
class test
{
    public static void main(String[] args){
        try{
            String url="jdbc:mysql://localhost:3308/college";
            Connection con = DriverManager.getConnection(url, "root", "");
            DatabaseMetaData rsmd=con.getMetaData();
            String table[]={"table"};
            ResultSet rs=rsmd.getTables(null,null,null,table);
            while (rs.next()) {
               System.out.println(rs.getString(3)); 
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}