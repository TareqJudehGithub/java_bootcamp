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
    double area = measureRectangle(length, width);

    stringPrinter(length, width, area);

    // Closing Scanner
    scan.close();
  }

  // functions
  public static double measureRectangle(double length, double width) {
    double area = length * width;
    return area;
  }

  public static void stringPrinter(double length, double width, double area) {
    System.out.println("The area of a rectangle with length of " + length + 
    " and width of " + width + " = " + area);
  }
}
