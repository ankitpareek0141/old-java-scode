abstract class A{
abstract void fun();
}

class B extends A{
void fun(){
 System.out.println("The fun() of B");
 }
}

class Demo{
public static void main(String[] args){
 A aa = new B();
 aa.fun();
 }
}