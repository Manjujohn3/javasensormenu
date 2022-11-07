import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Homeautomation {
    public static void main(String[] args) {


        int choice;

        while (true) {
            System.out.println("select an option");
            System.out.println("1.insert");
            System.out.println("2.view");
            System.out.println("3.search");
            System.out.println("4.exit");

            Scanner obj = new Scanner(System.in);
            choice = obj.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("insert  selected");
                    System.out.println("enter the temperature:");
                    int temperature = obj.nextInt();
                    System.out.println("enter the humidity:");
                    int humidity = obj.nextInt();
                    System.out.println("enter the moisture:");
                    int moisture = obj.nextInt();

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homeautomationdb", "root", "");
                        String sql = "INSERT INTO `sensorvalue`(`temperature`, `humidity`, `moisture`, `date`) VALUES (?,?,?,now())";
                        PreparedStatement stmt = con.prepareStatement(sql);
                        stmt.setInt(1, temperature);
                        stmt.setInt(2, humidity);
                        stmt.setInt(3, moisture);
                        stmt.executeUpdate();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.println("view selected");
                    break;
                case 3:
                    System.out.println("search selected");
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter correct value");
                    break;
            }

        }
    }
}