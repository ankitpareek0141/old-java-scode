class ThreadDemo1 extends Thread{

public void run(){
	System.out.println("Thread Runs by extending Thread class");
    }
}

class Example1{
	public static void main(String[] args){
		ThreadDemo1 obj = new ThreadDemo1();
		t1.start();
	}
}