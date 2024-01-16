class HashSetEx1
{  
  public static void main(String args[])
  {  
  //Creating HashSet and adding elements  
  HashSet<String> set = new HashSet<String>();  
  set.add("Santosh");  
  set.add("Ajay");  
  set.add("Ravi");  
  set.add("Sanjay");  
  
  //Traversing elements  
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext())
  {  
      System.out.println(itr.next());  
  }  
 }  
}  
