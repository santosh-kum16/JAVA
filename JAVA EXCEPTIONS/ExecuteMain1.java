public class Main {

  public static void main(String[] args) {
    checkAge(12); // Set age to 12 which is below 18 yrs.
  }
  
  static void checkAge(int age) {
    if (age < 18) { // If age will be less than Condition So. Custom Errors will throw
      throw new ArithmeticException("You Can't Vote - You must be at least 18 years old."); // Throwing a Custom Exception.
    }
    else {
      System.out.println("You can Vote - You are old enough.");
    }
  }

}
