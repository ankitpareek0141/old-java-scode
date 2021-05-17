class First{

public int a,b;

public void setter2(int a,int b){
this.a = a;
this.b = b;
}

public void display2(){
System.out.println("Sum of Variable of parent class : "+(a+b));
}

class Second{
public int a1,b1;

public void setter1(int a,int b){
a1 = a;
b1 = b;
}

public void display1(){
System.out.println("Sum of Variable of inner class : "+(a1+b1));
}
}  //end of inner class
}  //end of outer class


class Main{

public static void main(String[] args){
First ff = new First(); 
//Second ss = new Second();
ff.setter1(250,250);
ff.display1();
ff.setter2(350,350);
ff.display2();
}
}