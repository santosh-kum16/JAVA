public class StackEx1
{  
  public static void main(String args[])
  {  
    //Creating Object Of Stack
    Stack<String> stk = new Stack<String>();  

    stk.push("Santosh"); // Adding element to stack 
    stk.push("Nitish");  
    stk.push("Ajay");  
    stk.push("Sanjay");  
    stk.pop();  //Deleting element from the Stack from TOP of stack
    
    Iterator<String> itr=stack.iterator();  

    while(itr.hasNext())
    {  
      System.out.println(itr.next());  //Output will like - Sanjay, Ajay, Nitish
    }  
  }  
}  
