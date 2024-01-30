import java.util.*;  
class TreeMapEx1{  
 public static void main(String args[]){  
   TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();    
      map.put(100,"Sumit");    
      map.put(102,"Ravi");    
      map.put(101,"Sanjay");    
      map.put(103,"Rahul");    
        
      for(Map.Entry m:tmap.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }    
 }  
}  

/*
Out Put-
       100 Sumit
       101 Ravi
       102 Sanjay
       103 Rahul
*/
