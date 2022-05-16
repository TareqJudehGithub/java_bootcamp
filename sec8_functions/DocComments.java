/**
 * DocComments
 */
public class DocComments {
public static void main(String[] args) {
  
}
  // functions - Doc comments
  /**
   * Function name: greet
   * Parameters: None
   * return: prints: "Hello!"
   */
  public void greet() {
    System.out.println("Hello!");
  }
  /**
   * Function name: printText
   * @param name (String)
   * @param age (Int)
   * Inside the function:
   * Prints the name and age of the user.
   */
  public static void printText(String name, int age) {
    System.out.println("Hi, I'm " + name + "! I'm " + age + " years old!");
  }

  /**
   * Function name: calculateArea
   * @param length (double)
   * @param width (double)
   * @return (double)
   * Inside the function:
   * Calculates the area of rectangles given length and width values.
   */
  public static double calculateArea(double length, double width) {
    double area = length * width;
    return area;
  }

}