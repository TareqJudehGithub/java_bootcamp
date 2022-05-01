public class MathOperations {
  /**
   * Operators practice
   * @param args
   */
  public static void main(String[] args) {
    int bagOfSweets1 = 5;
    int bagOfSweets2 = 10;

    long starsInMilkyWay = 25000000000L;
    long starsInAndromeda = 10000000000L;

    double testScore = 6.7;
    double bonusMarks = 2.5;

    // plus + operator
    System.out.println("Fred and George collected "+ (bagOfSweets1 + bagOfSweets2) +" sweets");
    System.out.println("There are "+ starsInMilkyWay + starsInAndromeda + " stars in the Milky Way and Andromeda galaxies.");
    System.out.println( "With bonus marks, Ron scored " + testScore + bonusMarks + "/10 on his potions test. Snape wasn't too thrilled\n\n");

    // multiplications
    System.out.println("Multiplication");
    System.out.println(bagOfSweets1 * bagOfSweets2);
    System.out.println(testScore * bonusMarks + "\n\n");

    // multiplications
    System.out.println("Division");
    System.out.println(bagOfSweets1 / bagOfSweets2);
    System.out.println(starsInAndromeda / starsInAndromeda);
    System.out.println(testScore / bonusMarks);

    // modulus %
    System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " 
    + (10 % 2));
    System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5 % 2));

    // add one ++   Increases a variable value by 1
    int counter = 0;
    counter++;
    counter++;
    System.out.println(counter);

    // subtract one -- Decreases a variable value by 1
    counter--;
    counter--;
    System.out.println(counter);
    /* add by =+    increases the value by the number on the right
     10 += 5;
     >>> 15 

     subtract by =-    decreased the value by the number on the right
     10 += 5;
    */
  }
}

