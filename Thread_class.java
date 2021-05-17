class A extends Thread
{
 public void run(){
  for(int i=0;i<10;i++){
   System.out.println("i = "+i+"Thread A");
   }
 }
}  // end of class A

class B extends Thread
{
 public void run(){
  for(int i=0;i<10;i++){
   System.out.println("i = "+i+"Thread B");
   }
 }
}  // end of class B


class Example{

 public static void main(String[] args){
  A obj1 = new A();
  B obj2 = new B();
  obj1.start();
  obj2.start();
  }
}  // end of Example