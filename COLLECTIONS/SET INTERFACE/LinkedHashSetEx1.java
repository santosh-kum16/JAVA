public class LinkedHashSet
{  
  public static void main(String args[])
  {  
  LinkedHashSet<String> set = new LinkedHashSet<String>();  //It maintaining the Insertion Order and Store Unique value

  set.add("Mohit");  
  set.add("Triveni");  
  set.add("Dhoni");  
  //Traversing the values
  Iterator<String> itr = set.iterator();  
  while(itr.hasNext())
  {  
      System.out.println(itr.next());  
  }  
 }  
}  
