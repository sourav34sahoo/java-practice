class Display
{
	public void wish(String name) {
		;;;;;;;    // 1 lakh of code
		int x = 100;
		synchronized(x) {
			for(int i = 1; i<=5; i++) {
			System.out.print("Good Morning:");
			try {
				Thread.sleep(2000);
			} catch(Exception e) {
			}
			System.out.println(name);
		}
		}
		;;;;;;;// 1 lakh of code
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name) {
		this.d = d;
		this.name = name; 
	}
	public void run() {
		d.wish(name);
	}
}
class SynchronizedBlockToGetClassLevelLock
{
	public static void main(String...args) {
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread t1 = new MyThread(d1,"Rohit");
		MyThread t2 = new MyThread(d2,"Virat");
		t1.start();
		t2.start();
	}
}
/* Synchronized block concepts is applicable only for Object & classes but not for 
primitives otherwise we will get compiletime error.  */