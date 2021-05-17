class Ankit_Excep{

public static void main(String[] args){
 int a=6;
 try{
   int c = a/0;
   System.out.println(" = "+c);
  }
 catch(ArithmeticException s){
	System.out.println("Exception is = "+s);
  }
System.out.println("this is demo message");
 }
}