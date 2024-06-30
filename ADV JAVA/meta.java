import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

class meta 
 {
    public static void main(String[] args) {
        try{
            String url="jdbc:mysql://localhost:3308/college";
            Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement pstmt = con.prepareStatement("select * from emp");
            ResultSet rs=pstmt.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            System.out.println(rsmd.getColumnCount());
            System.out.println(rsmd.getColumnName(1));
            System.out.println(rsmd.getColumnType(1));
        }catch(SQLException e)
        {
             System.out.println(e.getMessage());
        }
    }
}
