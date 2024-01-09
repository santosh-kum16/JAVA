interface DemoInterface1 {
  public void demoMethod1(); // interface method
}

interface DemoInterface2 {
  public void demoMethod2(); // interface method
}

//Multiple interface can be IMPLEMENTS separating by Comma (,).
class DemoClass implements DemoInterface1, DemoInterface2 {
  public void demoMethod1() {
    System.out.println("This is Demo Method 1");
  }
  public void demoMethod2() {
    System.out.println("This is Demo Method 2");
  }
}

class Main {
  public static void main(String args[]) {
    DemoClass Obj = new DemoClass();
    Obj.demoMethod1();
    Obj.demoMethod2();
  }
}
 

