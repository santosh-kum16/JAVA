public class Exception1 {
  public static void main(String[ ] args) {
    try {
      int[] arr = {1, 2, 3,4,5};
      System.out.println(arr[8]); //Exceptions Happens at this line because wr are trying to fetch Array element at index 8 which is not possible
    } catch (Exception e) {
      System.out.println("Exceptions Happens");
    }
  }
}
