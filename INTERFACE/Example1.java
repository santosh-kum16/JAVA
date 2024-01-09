interface Plane { // Declaration of an Interface
  public void wing(); // interface method it does not required on the time of declaration a body
  public void cockpit(); // interface method it does not required on the time of declaration a body
}

//Passenger Plane Implements the Plane Interface

class PassengerPlane implements Plane{

  //The body of the wing method is writing here.
  public void wing(){
    //Code Line 1
    //Line 2 and so on ...

    System.out.println("Wing of the Passenger plane is Smaller tha Cargo Plane.");
  }

  //The body of the cockpit method is writing here.
  public void cockpit(){
    //Code Line 1
    //Line 2 and so on ...

    System.out.println("The Cockpit in the Plane only Accessible by the Crew Members not for Passenger");
  }

  //Declaring the Main method
  class CreatePlane{
    public static void main(String args[]){
      
      // In the main() we can't Create Object of "Plane Class" because it's interface, So interface doesn't required any Constructor.
      // all the metods declare in the interface is by default its "public and abstract".
      // Interface Attribute by default "public, static and final".
      // An implementation of an interface, you must override all of its methods
      
    PassengerPlane passengerPlane = new PassengerPlane(); //Creating Object of PassengerPlane
    passengerPlane.wing();
    passengerPlane.cockpit();
    }
  }
}
