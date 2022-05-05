import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        // Define a Scanner variable
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.print("First Name: ");
        String firstName = scan.nextLine();
        //Ask for their last name.
        System.out.print("Last Name: ");
        String lastName = scan.nextLine();
        //Ask: how old are you?
        System.out.print("How old are you? ");
        int age = scan.nextInt();
        //Ask them to make a username.
        scan.nextLine();
        System.out.print("Create a new username: ");
        String username = scan.nextLine();
        //Ask what city they live in.
        System.out.print("City: ");
        String city = scan.nextLine();
        //Ask what country that's from.
        System.out.print("Country: ");
        String country = scan.nextLine();


        //Task 2 - Print their information. 

        System.out.println("\nThank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //
        System.out.println(
            "First Name: " + firstName + "\n" +
            "Last Name: " + lastName + "\n" + 
            "Age: " + age + "\n" +
            "Username: " + username + "\n" +
            "City:" + city + "\n" +
            "Country:" + country + "\n"
            );

        //close scanner. It's good practice :D ! 
        scan.close();
    }
}