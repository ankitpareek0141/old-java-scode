class MyThread extends Thread{

public void start(){
 super.start();
 System.out.println("Start() Method called");
 }

public void run(){
System.out.println("run() method called");
}

}

class Example{

public static void main(String args[]){
 MyThread t = new MyThread();
 t.start();
 System.out.println("Main() method called");
 }
}