import java.util.*;  
class LinkedHashMap{  
 public static void main(String args[]){  
   
  LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();  
  
  hm.put(100,"Puneet");  
  hm.put(101,"Shekhar");  
  hm.put(102,"Vijay");  
  
for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  
