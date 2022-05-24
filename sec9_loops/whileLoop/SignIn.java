package whileLoop;
import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "sam";
        String password = "pass";
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("Username: ");
        //pick up username
        String signInUser = scan.nextLine();
        System.out.print("Password: ");
        //pick up password  
        String signInPass = scan.nextLine();
        /* Task 2 
            1. Set up a loop that keeps running while the username OR password is incorrect. 
               When they get it wrong:
                •  println: \nIncorrect, please try again!\n
                •  get them to enter their username and password again
            2. After they enter the correct information, print: 
                   \nSign in successful. Welcome!
       */
        while (!username.equals(signInUser) && !password.equals(signInPass)) {
            System.out.println("Incorrect, please try again!");
            System.out.print("Username: ");
            //pick up username
            signInUser = scan.nextLine();
            System.out.print("Password: ");
            //pick up password  
            signInPass = scan.nextLine();
        }
        System.out.println("Sign in successful. Welcome!");
        scan.close();

        
    }
}
