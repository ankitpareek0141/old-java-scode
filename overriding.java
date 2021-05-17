class A{

public void show(){
 System.out.println("Method of A called...");
 }
}

class B extends A{

public void show()
{
System.out.println("Method of B called...");
}

}

class c extends A{

public void show(){
System.out.println("Method of C called...");
}
}

class Anku{

public static void main(String[] args)
 {
 A obj1 = new c();
 obj1.show(); 
 }
}
