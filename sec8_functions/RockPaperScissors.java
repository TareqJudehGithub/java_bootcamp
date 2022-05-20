import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.print("Are you ready? Write 'yes' if you are. ");

    //Task 1: See if the user wants to play. 
        String startGame = scan.nextLine();
    // Task 2: Set up the game
         
    
        if (startGame.equals("yes") || startGame.equals("y")) {
            System.out.println("Great!\n rock – paper – scissors, shoot!");

            String computerChoice = computerChoice();
            System.out.println("Computer rolled: " + computerChoice);
            
            // Pick user's choice
            System.out.print("Please enter a choice: ");
            String userChoice = scan.nextLine();
            System.out.println("User roll: " + userChoice);
            System.out.println(result(userChoice, computerChoice));

        }
        else{
                System.out.println("Darn, some other time");
        }  


        scan.close();
    }


    //Task 3  – Write a function where the computer picks a random choice.

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */
    public static String computerChoice() {
        String computerRoll = "";
        double choice = (Math.random() * 3);
        // convert choice to integer
        int choiceIn = (int)choice;
        if (choiceIn == 0) {
            computerRoll = "rock";
        }
        else if (choiceIn == 1) {
            computerRoll = "paper";
        }
        else {
            computerRoll = "scissors";
        }
        return computerRoll;
    }


    //Task 4  – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   1. result is "You win" if:
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     * 
     *   2. result is "You lose" if:
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     * 
     *   3. result is "It's a tie" if:
     *       your choice equals computer choice.
     */
    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        // user wins
        if (yourChoice.equals(computerChoice))  {
            result = "Draw";
        }
        else if (yourChoice.equals("rock") 
            && computerChoice.equals("scissors")) {
            result = "You win! rock > scissors!";
        }
        else if (yourChoice.equals("paper") 
            && computerChoice.equals("rock")) {
            result = "You win! paper > rock";
        }
        else if (yourChoice.equals("scissors") 
            && computerChoice.equals("paper")) {
            result = "You win! scissors > paper";
        }
        // computer wins
        else if (computerChoice.equals("rock")
            && yourChoice.equals("scissors")) {
            result = "Computer wins!  rock > scissors!";
        }
        else if (computerChoice.equals("paper") 
            && yourChoice.equals("rock")) {
            result = "Computer wins! paper > rock";
        }
        else if (computerChoice.equals("scissors")
            && yourChoice.equals("paper")) {
            result = "Computer wins! scissors > paper";
        }
        // Draw
        else {
            System.out.println(yourChoice + " is not a valid entry");
            result = "Please enter one of: rock, paper, scissors!";
        }
       
        return result;
      }
 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */

}
