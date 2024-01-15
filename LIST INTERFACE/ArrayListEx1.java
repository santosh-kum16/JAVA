 class ArrayListEx1
 {  
  public static void main(String args[])
   {  
    //Creating ArrayList Object
    ArrayList<String> list = new ArrayList<String>();  
    
    //Adding object in arraylist
    list.add("Santosh");  
    list.add("Nitish");  
    list.add("Sanjay");  
    list.add("Ajay");
    list.add("Ritesh");
    
    //Traversing the list through Iterator  
    Iterator itr=list.iterator();  
    while(itr.hasNext())
    {  
      System.out.println(itr.next());  
    }  
  }
 }
