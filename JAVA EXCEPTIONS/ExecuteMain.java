public class ExecuteMain {
  public static void main(String args[]) {
    try {
      int[] arr = {1,2,3,4,8,9};
      System.out.println(arr[12]);
    } catch (Exception e) {
      System.out.println("catch Block executed!!!");
    } finally { 
      // The finally block always be execute even try, catch block ie executed or not.
      System.out.println("Finally Block Excecuted");
    }
  }
}
