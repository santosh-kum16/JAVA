import java.util.*;  
public class LinkedHashMap 
{  
   public static void main(String args[]) {  
    Map<Integer,String> lhmap = new LinkedHashMap<Integer,String>();        
     lhmap.put(101,"Sonu");    
     lhmap.put(102,"Shivesh");    
     lhmap.put(103,"Shivam");    
     System.out.println("Before Calling remove() method:- "+map);     
    map.remove(102);  
    System.out.println("After calling remove() method:- "+map);    
   }      
}  

/*
OUT PUT-
Before Calling remove() method:- {101=Sonu, 102=Shivesh, 103=Shivam}
After Calling remove() method:- {101=Sonu, 103=Shivam}
*/
