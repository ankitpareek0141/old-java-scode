class A{

public A(){
System.out.println("Constructor of A");
} 

{
System.out.println("IIB of A");
}

} 



class B extends A{

public B(){
super();
System.out.println("Constructor of B");
} 

{
System.out.println("IIB of B");
}

public static void main(String args[]){
 B b = new B();
 }
}