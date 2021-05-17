class A{
public void fun1()
 {
 System.out.println("This is fun 1 in A");
 }

public void fun2()
 {
 System.out.println("This is fun 2 in A");
 }
}

class B  extends A{

public void fun3()
 {
 System.out.println("This is fun 1 in B");
 }
}


class Demo{

public static void main(String[] args){
 B bb = new A();
 bb.fun1();
 bb.fun2();
 bb.fun3();
 }
}