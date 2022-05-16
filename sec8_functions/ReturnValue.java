import java.util.Scanner;

public class ReturnValue {
  public static void main(String[] args) {
    // Define a scanner
    Scanner scan = new Scanner(System.in);

    // Ask user for triangle dimensions inputs:
    System.out.print("Length: ");
    double length = scan.nextDouble();

    System.out.print("Width: ");
    double width = scan.nextDouble();

    // Calculate area:
    double area = measureRectangle(length, width);

    stringPrinter(length, width, area);

    // Closing Scanner
    scan.close();
  }

  // functions
  public static double measureRectangle(double length, double width) {
    if ( length < 0 || width < 0 ) {
      System.out.println("Error in inputs");
      System.exit(0); // break from the function
    }
      double area = length * width;
      return area;
   
    
  }
  
  public static void stringPrinter(double length, double width, double area) {
    if ( length < 0 || width < 0) {
      System.out.println("Negative values are not acceptable.");
    }
    else {
      System.out.println("The area of a rectangle with length of " + length + 
      " and width of " + width + " = " + area);
    }
  }
}
