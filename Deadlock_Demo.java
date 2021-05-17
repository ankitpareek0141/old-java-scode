class A{								// class A
	public synchronized void d1(B b){
		System.out.println("Thread t1 starts executing method d1()");
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException exp){
			System.out.println("another thread interrupted : "+exp);
		}
		System.out.println("Thread 1 is trying to call A's last method");
		b.last();
	}
	
	public synchronized void last(){
		System.out.println("last() method callad by a's Object");	
	}
}

class B{								// class B
 	public synchronized void d2(A a){
		System.out.println("Thread t2 starts executing mathod d2()");
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException exp){
			System.out.println("another thread interrupted : "+exp);
		}
		System.out.println("Thread 2 is trying to call A's last method");
		a.last();
	}
	
	public synchronized void last(){
		System.out.println("last() method callad by b's Object");	
	}
}


class Deadlock_Java extends Thread{    // class Deadlock_Java
A a = new A();
B b = new B();

public void m1(){
	this.start();
	a.d1(b);
}

public void run(){
	b.d2(a);	
}

public static void main(String[] args){
	Deadlock_Java dd = new Deadlock_Java();
	dd.m1();
	}
}