import java.util.*;  
public class HashMapExample2{  
 public static void main(String args[]){  

   //Creating HashMap
   HashMap<Integer,String> map = new HashMap<Integer,String>();    
   
   //Put elements in Map
   map.put(1,"Manoj");    
   map.put(2,"Amod");    
   map.put(3,"Binod");   
   map.put(1,"Prabhash"); //trying duplicate key  
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  

/*
Out Put:-
Iterating Hashmap...
1 Prabhash
2 Amod
3 Binod
*/
