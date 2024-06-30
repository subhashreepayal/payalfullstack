import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class crud {
    public static void main(String[] args) {
        try {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter database name:");
                String dbName = sc.next();
                System.out.println("Enter table name:");
                String tableName = sc.next();

                String url = "jdbc:mysql://localhost:3308/";
                Connection con = DriverManager.getConnection(url, "root", "");
                Statement stmt = con.createStatement();

                // Create database
                stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS " + dbName);
                System.out.println("Database created successfully.");

                // Use database
                stmt.executeUpdate("USE " + dbName);
                System.out.println("Using database: " + dbName);

                // Create table
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS " + tableName
                        + " (id INT, name VARCHAR(255), salary DOUBLE, deptname VARCHAR(255))");
                System.out.println("Table created successfully.");

                System.out.println("I for insert, D for Delete, U for update , S for select , Stop for end");

                String status = sc.next();
                int id;
                String name;
                double salary;
                String deptname;
                while (!status.equalsIgnoreCase("stop")) {
                    switch (status.toUpperCase()) {
                        case "I":
                            System.out.println("Enter id, name, salary, and deptname");
                            id = sc.nextInt();
                            name = sc.next();
                            salary = sc.nextDouble();
                            deptname = sc.next();
                            stmt.executeUpdate("insert into " + tableName + " values(" + id + ",'" + name + "',"
                                    + salary + ",'" + deptname + "')");
                            break;

                        case "U":
                            System.out.println("Enter id for update");
                            id = sc.nextInt();
                            System.out.println("Enter name for " + id + " to update");
                            name = sc.next();
                            System.out.println("Enter salary for " + id + " to update");
                            salary = sc.nextDouble();
                            System.out.println("Enter deptname for " + id + " to update");
                            deptname = sc.next();
                            stmt.executeUpdate("update " + tableName + " set name ='" + name + "', salary=" + salary
                                    + ", deptname='" + deptname + "' where id=" + id);
                            break;

                        case "D":
                            System.out.println("Enter id for delete");
                            id = sc.nextInt();
                            stmt.executeUpdate("delete from " + tableName + " where id=" + id);
                            break;

                        case "S":
                            ResultSet rs = stmt.executeQuery("select id, name, salary, deptname from " + tableName);
                            while (rs.next()) {
                                System.out.println(rs.getInt(1) + "  |  " + rs.getString(2) + "  |  " + rs.getDouble(3)
                                        + "  |  " + rs.getString(4));
                                System.out.println("--------------------------------------------------");
                            }
                            break;
                        default:
                            break;
                    }
                    System.out.println("I for insert, D for Delete, U for update , S for select , Stop for end");
                    status = sc.next();
                }
            }
            System.out.println("Exit............");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
