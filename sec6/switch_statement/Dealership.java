import java.util.Scanner;

public class Dealership {
  public static void main(String[] args) {
  // Setup Scanner
  Scanner scan = new Scanner(System.in)    ;
  System.out.println("Welcome to the Java Dealership");
  System.out.println("Select option 'A' to buy a car");
  System.out.println("Select option 'B' to sell a car");

  String option = scan.nextLine();

  switch (option) {
    // Option A
    case "A":
      System.out.println("What is your budget?");
      int budget = scan.nextInt();
      // Check if user's budget is 10k or above
      if (budget >= 10000) {
        System.out.println("Great! A Nissan Altima is available.");
        
        // If true, check for insurance, license, and a good credit score
        System.out.println("Do you have insurance? (yes/no)");
        scan.nextLine();
        String insurance = scan.nextLine();
        System.out.println("Do you have a license? (yes/no)");
        String license = scan.nextLine();
        System.out.println("What is your credit score?");
        int creditScore = scan.nextInt();

        if (insurance.equals("yes") && license.equals("yes") && creditScore > 660) {
          System.out.println("Sold! Pleasure doing business with you.");
        } else {
          System.out.println("Sorry, but you're not eligible to buy a car.");
        }

      } else {
        System.out.println("Sorry, but we don't sell cars under $10000.");
      }
      break;
    case "B":
      System.out.println("What is your car values at?");
      int carValue = scan.nextInt();
      System.out.println("What is your car selling price?");
      int sellPrice = scan.nextInt();

      // Check if car value is greater than price, and price is lower than 30k
      if (carValue > sellPrice && sellPrice < 30000) {
        System.out.println("We will buy your car. Pleasure doing business with you.");

      } else {
        System.out.println("Sorry we are not interested.");
      }
      break;
    default:
      System.out.println("Invalid option");
  }
  // Closing Scanner
  scan.close();
  }
}
