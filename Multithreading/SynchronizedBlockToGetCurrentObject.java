class Display
{
	public void wish(String name) {
		;;;;;;;    // 1 lakh of code
		synchronized(this) {
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
class SynchronizedBlockToGetCurrentObject
{
	public static void main(String...args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d,"Rohit");
		MyThread t2 = new MyThread(d,"Virat");
		t1.start();
		t2.start();
	}
}