class Display
{
	public static synchronized void wish(String name) {
		for(int i = 0; i < 10; i++){
			System.out.print("Good Morning");
			try {
				Thread.sleep(1500);
			}
			catch(InterruptedException e) {
			}
			System.out.println(name);
		}
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
class SynchronizedDemo2
{
	public static void main(String...args){
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread t1 = new MyThread(d1,"Rohit");
		MyThread t2 = new MyThread(d2,"Virat");
		t1.start();
		t2.start();
	}
}
//static synchronized
// If a thread once to execute static synchronized this class level lock is required