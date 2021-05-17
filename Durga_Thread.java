class MyThread extends Thread
{
/*public void run(){
  for(int i=0;i<10;i++){
    System.out.println("Child Thread...");
   }
  } */ // end of run()
}//end of MyThread



class Example{

public static void main(String[] args){
 MyThread t = new MyThread();
 t.start();
 //t.run();
for(int i=0;i<10;i++){
    System.out.println("Main Thread...");
   }
 }
}