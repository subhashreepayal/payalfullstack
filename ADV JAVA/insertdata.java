import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertdata {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3308/college";
            Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement("insert into empl(empid,empname,salary) value(?,?,?)");
            stmt.setInt(1, 777);
            stmt.setString(2, "gimi");
            stmt.setInt(3, 70000);
            stmt.execute();
            System.out.println("success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}