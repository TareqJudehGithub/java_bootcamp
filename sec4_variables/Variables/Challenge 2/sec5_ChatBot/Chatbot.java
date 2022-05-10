//import Scanner
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        //set up scanner. 
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number:");
        int randomNum = scan.nextInt();
        System.out.println(randomNum);
        
        System.out.println("Hello. What is your name?");
        //Pick up user's name and store it. 
        scan.nextLine();
        String myName = scan.nextLine();
                           
        //add new a line before asking next question. 
        System.out.println("Hi " + myName +"!" + " I'm Javabot. Where are you from?");
        //Pick up user's home and store it. 
        String home = scan.nextLine();
                      
        //add new a line before asking next question.
        System.out.println("\nI hear it's beautiful at " + home +"!" + " I'm from a place called the Oracle");
        System.out.println("How old are you?");
        //Pick up age and store it.
        int age = scan.nextInt();
        
        //add new a line before asking next question.
        System.out.println("So you're " + age +", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400/age)+" times older than you.");

        System.out.println("Enough about me. What's your favorite language? (just don't say Python)");
        //Pick up language and store it. 
        scan.nextLine();
        String language = scan.nextLine();
        System.out.println(language);


        //add new a line here.
        System.out.println(language + ", that's great! Nice chatting with you, "+ myName +".\nI have to log off now. See ya!");
        
        //close scanner. 
        scan.close();
        
    }
}
