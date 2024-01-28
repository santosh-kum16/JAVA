import java.util.*;  
class LinkedHashMap2{  
 public static void main(String args[]){  
   LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();           
     lhmap.put(100,"Vinod");    
     lhmap.put(101,"Vishnu");    
     lhmap.put(102,"Rahul");    
       //Fetching key  
       System.out.println("Keys:= "+lhmap.keySet());  
       //Fetching value  
       System.out.println("Values:= "+lhmap.values());  
       //Fetching key-value pair  
       System.out.println("Key-Value pairs:= "+lhmap.entrySet());  
 }  
}  

/*
OUT PUT:-
Keys:= [100, 101, 102]
Values:= [Vinod, Vishnu, Rahul]
Key-Value pairs:= [100=Vinod, 101=Vishnu, 102=Rahul]
*/
