abstract class Car{  //Defining an Abstract class
  abstract void design();  // Defining an Abstract method
}  
class Harrier extends Car{  //Extending the "design method" from "Car" class to here in Harrier class
void design()  // Providing the body to design method
{
  System.out.println("This Car Design is Awesome!!!");
}  
public static void main(String args[]){  
 Car obj = new Harrier();  // Creating Object of Harrier Class and giving the Object Reference to the Car
 obj.design();  //Here we are accessing the "design method" with the Car reference
}  
} 
