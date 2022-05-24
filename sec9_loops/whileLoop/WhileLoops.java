package whileLoop;

/**
 * WhileLoops
 */
import java.util.Scanner;
public class WhileLoops {
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    int number = 25;
    while (number > 0) {
      System.out.println(number);
      number -= 5;
    }
    String greet = greeting();
    System.out.println(greet);
  }

  public static String greeting() {
    String greeting = " ";
    while (!greeting.equals("Hi")) {
      System.out.print("Enter a greeting: ");
      greeting = scan.nextLine();
     }
     scan.close();
     return greeting;   
}         
}