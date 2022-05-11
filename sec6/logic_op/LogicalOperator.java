public class LogicalOperator {
  public static void main(String[] args) {

    // OR operator ||
    int chemistryGrade = 70;
    int englishGrade = 65;
    String language = "Java";
    // check if any grade is above 75, or language is Java.
    if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java"))  {
      System.out.println("Congratulations! you got the scholarship.");
    } else {
      System.out.println("Sorry, you did not get the scholarship.");
    }
    int credits = 56;
    double GPA = 1.2;

    if (credits >= 40 && GPA >= 2.0) {
      System.out.println("You earned the diploma!");
    }
    else {
      System.out.println("Sorry, but you need at least a minimum of" +
      " 40 credits and a GPA score of 2.0");
    }
  }
}
