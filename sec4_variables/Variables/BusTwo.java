public class BusTwo {
  /**
   * Updating a variable
   * A bus ride 
   */
public static void main(String[] args) {
  String sentence = "Number of passengers: ";
  int passengers = 0;
  System.out.println(sentence + passengers);

  // The bus stops at the bus station, and picks up 9 passengers
   passengers +=  9;
   System.out.println(sentence + passengers);

  // The bus stops at the bus station, and drops up 5 passengers
   passengers -= 5;
   System.out.println(sentence + passengers);

  // The bus stops at the bus station, and drops the remaining passengers
  passengers -= 4;
  System.out.println(sentence + passengers);

  sentence = "End of shift for today.";
  System.out.println(sentence);

}
}
