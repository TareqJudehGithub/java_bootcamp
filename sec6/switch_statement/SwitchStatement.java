import java.util.Scanner;

public class SwitchStatement {
  public static void main(String[] args) {
    // Define a scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter a month: ");
    String month = scan.nextLine();

    switch (month) {
      case "January":
        System.out.println("Winter");
        break;
      case "February":
        System.out.println("Winter");
        break;
      case "March":
        System.out.println("Spring");
        break;
      case "April":
        System.out.println("Spring");
        break;
      case "May":
        System.out.println("Spring");
        break;
      case "June":
        System.out.println("Summer");
        break;
      case "July":
        System.out.println("Summer");
        break;
      case "August":
        System.out.println("Summer");
        break;
      case "September":
        System.out.println("Autumn");
        break;
      case "October":
        System.out.println("Autumn");
        break;
      case "November":
        System.out.println("Autumn");
        break;
      case "December":
        System.out.println("Winter");
        break;
      default:
        System.out.println("Invalid month");
    }
    // Closing scanner
    scan.close();
  }
}