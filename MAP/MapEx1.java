import java.util.*;  
class MapEx1{  
 public static void main(String args[])
  {  
  Map<Integer,String> map = new HashMap<Integer,String>();  
  
   map.put(100,"Aman");  
  map.put(101,"Ankush");  
  map.put(102,"Hardik");  
   
  //Elements can traverse in any order  
  for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  
