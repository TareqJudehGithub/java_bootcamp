
import java.util.Scanner;

public class Survey {
/**
 * Scanners
 */
  public static void main(String[] args) {
    // Define Scanner variable to get values from the user:
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Java survey");
    System.out.print("What is your name? ");

    // Counter to follow up with questions numbers:
    int counter = 0;
    // Prompt user to enter a String value
    String name = scan.nextLine();
    System.out.println("Name: " + name);
    counter++;

    // Prompt user to enter a double value
    System.out.print("How much you spend on coffee? ");
    double coffee = scan.nextDouble();
    System.out.println("Money spent on Coffee: " + coffee);
    counter++;

    // Prompt user to enter another double value
    System.out.print("How much money you spend on fast food? ");
    double fastFood = scan.nextDouble();
    System.out.println("Money spend on fast food: " + fastFood);
    counter++;

    // Prompt user to enter an int value
    System.out.print("How many times a week do you eat fast food? ");
    int fastFoodPerWeek = scan.nextInt();
    System.out.println("Fast food/week: " + fastFoodPerWeek);
    counter++;

    // Closing the Scanner:
    scan.close();
    System.out.println("Thank you " + name + " for answering these " + counter + " questions.\nGood Bye!");


  }
}