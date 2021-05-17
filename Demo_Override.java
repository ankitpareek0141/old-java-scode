class First{
public void name(String a, String b){
 System.out.println("First Name : "+a+"\nSecond Name : "+b);
 System.out.println("Method of First");
 }
}

class Second extends First{

public void name(String a, String b)
 {
 System.out.println("First Name : "+a+"\n Second Name : "+b);
 System.out.println("Method of Second");
 }
}

class Third extends First{
public void name(String a, String b)
 {
 System.out.println("First Name : "+a+"\n Second Name : "+b);
 System.out.println("Method of Third");
 }
}

class Demo{
public static void main(String[] args){
First a = new First();
Second b = new Second();
Third c = new Third();

First ref;

ref = a;
ref.name("Ankit","Pareek");
ref = b;
ref.name("Ankit 1","Pareek");
ref = c;
ref.name("Ankit 2","Pareek");

 }
}