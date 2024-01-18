import java.util.*;  
class MapEx1
{  
 public static void main(String args[])
  {
    //Creating map object by generic (Integer is key and String is value)
    Map<Integer,String> map = new HashMap<Integer,String>();  
    map.put(1,"Santosh");  
    map.put(2,"Nitish");  
    map.put(3,"Rahul");  
    //Elements can traverse in any order  
    for(Map.Entry m:map.entrySet())
    {  
      System.out.println(m.getKey()+" "+m.getValue());  
    }  
   }  
}  

/*output
1 Santosh
2 Nitish
3 Rahul
  */
