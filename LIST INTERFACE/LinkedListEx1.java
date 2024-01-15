public class LinkedListEx1
{  
  public static void main(String args[])
  {  
    //Creating LinkedList Object
    LinkedList<String> ll = new LinkedList<String>(); 
    
    ll.add("Santosh");// Adding element to LinkedList also it retain Insertion Order and can store Duplicate also
    ll.add("Nitish");  
    ll.add("Santosh");  
    ll.add("Sanjay");  
    
    Iterator<String> itr = ll.iterator(); 
    
    while(itr.hasNext())
    {  
      System.out.println(itr.next());  //Printing all elements and it will maintain and display as insertion order
    }  
  }  
}  
