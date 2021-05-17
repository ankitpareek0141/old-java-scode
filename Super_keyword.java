class A{
public int x;
 public void fun(){
 System.out.println("In Function of class A");
 this.x = x;
 System.out.println("Value in x : "+this.x);
 }
}

class B extends A{

public int x;
 public void fun(int x){
  super.x = 150;
  super.fun();
  this.x = x;
  System.out.println("In Function of class B");
  System.out.println("Value in x : "+this.x);
 }
}


class Demo{

public static void main(String[] args){
 B bb = new B();
 bb.fun(50);
 }
}