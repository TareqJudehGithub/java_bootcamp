public class Scope {
  static String dog = "Doug The pug";
  public static void main(String[] args) {
    System.out.println(dog);
    someFunction();
  }
  public static void someFunction() {
    int apples = 5;
    System.out.println(apples);
  }
  
}
