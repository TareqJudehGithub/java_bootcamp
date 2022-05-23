package for_loop;
public class Beer {
    public static void main(String[] args) {
       // Task 2: make a for loop that starts at i = 99, and finishes at i=1.
       for (int i = 10; i >= 1; i--) {
          sing(i);
       }
    }

    /** Task 1
     * Function name – sing.
     * @param i (int)
     * Inside the function: 
     *  1. print:
     *      <i> bottles of beer on the wall, <i> bottles of beer!
     *      take one down, pass it around, <i-1> bottles of beer on the wall!
     */
   public static void sing(int i) {
      int bottleRemaining = i - 1;

      System.out.println(
         i +
         " bottles of beer on the wall, "+ i + " bottles of beer!\n" + 
         "take one down, pass it around, "+ (i - 1) + " bottles of beer on the wall!\n"
      );
   }

}
