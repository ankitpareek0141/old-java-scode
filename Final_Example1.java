final class Demo{

public final void fun(){
 System.out.println("In fun() in Demo..");
 }

public static void main(String[] args){
 Demo dd = new Demo();
 dd.fun();
 }
}





/*
class Final_Example1 extends Demo{    //final function cannot be override 

public void fun(){
final int x=10;  // if we don't initialize it, then it will remain blank so we should initialize it before use
//x = 20;
System.out.println("Value in x : "+x);
}
public static void main(String[] args){
Final_Example1 aa = new Final_Example1();
aa.fun();
}
}
*/