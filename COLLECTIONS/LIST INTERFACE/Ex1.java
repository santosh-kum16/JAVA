// Java program to show the use of List Interface
import java.util.*;

class LstInterface {

    public static void main(String[] args)
    {

        // Creating a List of Strings using ArrayList
        List<String> list = new ArrayList<>();

        // Adding elements in List
        list.add("Java");
        list.add("Python");
        list.add("DSA");
        list.add("C++");

        System.out.println("Elements of List are:");

        // Iterating through the list
        for (String str : list) {
            System.out.println(str);
        }

        // Accessing elements
        System.out.println("Element at Index 1: "+ list.get(1));

        // Updating elements
        list.set(1, "JavaScript");
        System.out.println("Updated List: " + list);

        // Removing elements
        list.remove("C++");
        System.out.println("List After Removing Element: " + list);
    }
}
