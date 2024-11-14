import java.util.concurrent.locks.*;
class Display
{
	ReentrantLock l = new ReentrantLock();
	public void wish(String name) {
		l.lock();                      // -----> line 1
		for (int i = 0; i < 5; i++) {
			System.out.println("Good Morning");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
			System.out.println(name);
		}
		l.unlock();                 // -------> line 2
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name) {
		this.d = d;
		this.name = name ;
	}
	public void run() {
		d.wish(name);
	}
}
class ReentrantLockDemo2
{
	public static void main(String...args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d,"Dhoni");
		MyThread t2 = new MyThread(d,"Rohit");
		MyThread t3 = new MyThread(d,"Virat");
		t1.start();
		t2.start();
		t3.start();
	}
}

// If we comment line 1 & 2 then the Threads will be executed simultaniously and we will get irregular output
// If we are not commenting line 1 & 2 then the Threads will be executed one by one and we will get regular output 