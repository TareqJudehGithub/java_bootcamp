public class Bus {
  public static void main(String[] args) {
    // Declaring passengers variable with initial value of 0.
    String sentence = "Number of passengers: ";
    int passengers = 0;


    // Picking 5 passengers to the bus.
    passengers += 5;
    System.out.println(sentence + passengers);

    // offloading 2 passengers
    passengers -= 3;
    System.out.println(sentence + passengers);

    // Picking 4 passengers to the bus.
    passengers += 4;
    System.out.println(sentence + passengers +"\n");

    System.out.println("Total passengers: " + passengers + "\n");

    System.out.println("End of shift. Thank you!");

  }
}