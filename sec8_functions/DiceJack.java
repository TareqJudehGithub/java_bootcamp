import java.util.Scanner;

public class DiceJack {
  public static void main(String[] args) {
    
    
    // Setup Scanner:
    Scanner scan = new Scanner(System.in);
    
    // Prompt user to input 3 number:
    System.out.print("Enter the 1st number: ");
    int num1 = scan.nextInt();
    System.out.print("Enter the 2nd number: ");
    int num2 = scan.nextInt();
    System.out.print("Enter the 3rd number: ");
    int num3 = scan.nextInt();
    
    // Check if user enters a number < 1 or > 6
    if( num1 < 1 || num2 < 1 || num3 < 1)  {
      System.out.println("Number should be between range 1 to 6");
      System.exit(0);
    }
    if( num1 > 6 || num2 > 6 || num3 > 6)  {
      System.out.println("Number should be between range 1 to 6");
      System.exit(0);
    }
    
    System.out.println(" ");
    // call rollDice function 3 times:
    int roll1 = rollDice();
    int roll2 = rollDice();
    int roll3 = rollDice();

    System.out.println(" ");

    System.out.println("First dice roll:" + roll1);
    System.out.println("Second dice roll:" + roll2);
    System.out.println("Third dice roll:" + roll3);

    // Sum of all user inputs
    int sumDiceRolls = roll1 + roll2 + roll3;
    int sumOfNumbers = num1 + num2 + num3;

    System.out.println("Dice sum = " + sumDiceRolls + 
    "\nNumbers sum =" + sumOfNumbers);
    
    System.out.println("");

    // Check if the user wins
    if (checkWin(sumDiceRolls, sumOfNumbers)) {
      System.out.println("Congratulations! you've won!");
    } else {
      System.out.println("Sorry! Try again!");
    }
    
    // Close Scanner
    scan.close();
  }
  /**
     * Function name: rollDice
     * Inside the function:
     * return: a random number between 1 and 6
     */
  public static int rollDice() {
    double randomNum = (Math.random() * 6) + 1;
    return (int)randomNum;
  }

  /**
   * Function name: checkWin
   * 
   */
  public static boolean checkWin(int sumDice, int sumNum) {
    return sumDice < sumNum && sumNum - sumDice < 3;
      
   
  }
}
