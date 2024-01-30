import java.util.*;  
public class TreeMapEx2 {  
   public static void main(String args[]) {  
    TreeMap<Integer,String> tmap = new TreeMap<Integer,String>(); 
     
      tmap.put(100,"Sumit");    
      tmap.put(102,"Sanjay");    
      tmap.put(101,"Ajay");    
      tmap.put(103,"Vijay");    
     
     System.out.println("Before invoking remove() method");  
      for(Map.Entry m:tmap.entrySet())  
      {  
          System.out.println(m.getKey()+" "+m.getValue());      
      }  
      tmap.remove(102);      
      System.out.println("After invoking remove() method");  
      for(Map.Entry m:tmap.entrySet())  
      {  
          System.out.println(m.getKey()+" "+m.getValue());      
      }  
      }  
}  

/*
OUT PUT-
Before invoking remove() method
100 Sumit
101 Sanjay
102 Ajay
103 Vijay
After invoking remove() method
100 Sumit
101 Sanjay
103 Vijay
*/
