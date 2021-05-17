class Base { 
    private void foo() { System.out.println("Base"); } 
} 
  
class Derived extends Base { 
  
    // works fine 
    public void foo() { System.out.println("Derived"); }  
} 
  
class Main { 
    public static void main(String args[]) { 
        Derived d = new Derived(); 
        d.foo(); 
    } 
} 