class First{

public static int a;

public static void setter1(int a){
   First.a = a;
 }

public static void display1(){
System.out.println("variable in outer class : "+a);

}

public static class Second{

public int b;

public void setter2(int b){
  this.b = b;
  setter1(30);
}

public void display2(){
   System.out.println("Variable in Inner class : "+b+" and Variable of Outer class : "+a);
   display1();
  }
 } // inner class end
} // outer class end
  
class Example{
  
public static void main(String[] args)
{ 
 //First ff = new First();
 First.Second ss = new First.Second();
  
 ss.setter2(20);
 ss.display2();
 }
} 