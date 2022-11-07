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