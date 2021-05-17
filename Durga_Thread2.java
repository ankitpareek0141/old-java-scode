class MyThread extends Thread{
public void run(){
 System.out.println("Run() method called");
 }
}

class Demo{

public static void main(String[] args){
 MyThread t = new MyThread();
 t.start();
 System.out.println("Main Thread...");
 try{
 t.start(); // we cannot restart a Thread, otherwise it will give you an exception
 }
catch(Exception exp){
 System.out.println("Exception : "+exp);
 }
 }
}
