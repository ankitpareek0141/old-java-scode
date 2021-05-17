abstract class Person{

abstract void fun();

Person()
 {
 System.out.println("Person constructor called..");
 }
}

class Employee extends Person{

void fun(){
System.out.println("fun called");
}

Employee(){
System.out.println("Constructor called..");
}
}

class Demo{

public static void main(String[] args){
Employee ee = new Employee();
ee.fun();
}
}