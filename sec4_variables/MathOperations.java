/**
 * MathOperations
 - In Java, math operations must be put between brackets.
 */
public class MathOperations {

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

    /* Modulus %
       The modulo operator is used to compute the remainder of an 
       integer division
    */

    System.out.println("Modulo \n" + 10 % 3);

    // add one ++   Increases a variable value by 1

    // subtract one -- Decreases a variable value by 1

    // add by =+    increases the value by the number on the right
    // 10 += 5;

    // subtract by =-    decreased the value by the number on the right
    // 10 += 5;
  } 
}



/*
Snape ended up removing marks. Ron actually scored <result> on his potions test



Fred and George used a special spell to multiply their sweets to: <result>

Snape made an error on his excel, accidentally multiplying Ron's score to: <result>/10



Originally, Fred had  <result> times more sweets than George

Andromeda has <result> times more stars

Snape caught the error. Furious, he divided Ron's score to: <result>


Math Operators - Part 2

10 is an even number, since dividing 10 by 2 has a remainder of: <remainder>

5 is an odd number, since dividing 5 by 2 has a remainder of: <remainder>
*/