public class BuiltInFunc {
  public static void main(String[] args) {
    // Calling a function named println() receiving a parameter "Hello world"
    System.out.println("Hello world");

    // Math
    // Calculate the sine of 1.2
    double sine = Math.sin(1.2);
    System.out.println("The sine of 1.2 is: " + sine);

    // Calculate 2 raised to the power of 4  (base, exponent)
    double toThePow = Math.pow(2, 4);
    System.out.println("2 to the power of 4 is: " + toThePow);

    // random - random draws a random number between the values 0 and 1
    double randomNum = Math.random();
    System.out.println("The random value is: " + randomNum);
    // random number between 0 and 10 without decimals
    double randomNum2 = Math.floor(Math.random() * 10) + 1;
    System.out.println((int)randomNum2);

    // square root

    double squareRoot = Math.sqrt(128);
    System.out.println("Square root is: " + (int)squareRoot);

    // max()
    int maxValue = Math.max(10, 12);
    System.out.println(("The greater value between 10 and 12 is: " + maxValue));
  }
}
