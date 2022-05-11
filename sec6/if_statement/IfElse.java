import java.util.Scanner;

public class IfElse {
  /**
   * If statement practice
   */
  public static void main(String[] args) {

    // Setup Scanner
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a score mark: ");
    int score = scanner.nextInt();
    // int grade = 89;

    if (score >= 80) {
      System.out.println("Great job! you scored A");
    }
    else if (score >= 70) {
      System.out.println("Great job! you scored B");
    }
    else if (score >= 60) {
      System.out.println("You scored a C");
    }
    else if (score >= 50) {
      System.out.println("You scored a D");
    }
    else {
      System.out.println("You failed! Score is F");}
  }
}
