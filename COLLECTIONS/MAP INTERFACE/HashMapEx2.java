import java.util.*;  
public class HashMapEx1
{  
   public static void main(String args[])
  {  
     //Creating HashMap
     HashMap<Integer,String> hm = new HashMap<Integer,String>();   
     //Storing elements in HashMap
     hm.put(1,"Physics");    
     hm.put(2,"Chemistry");    
     hm.put(3,"Biology");  
     hm.put(1,"Chemistry"); //Duplicate Entry
       
     System.out.println("Iterating HashMap...");  
     for(Map.Entry m : hm.entrySet())
     {    
        System.out.println(m.getKey()+" "+m.getValue());    
     }  
  }  
}  

/*
OUTPUT- Duplicate entry are Removed automatically, Duplicate KEY are not allowed
1 Physics
2 Chemistry
3 Biology
*/
