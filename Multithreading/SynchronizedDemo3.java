class Display
{
	public void displayn() {
		for(int i = 1; i <= 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
			}
		}
	}
	public void displayc() {
		for(int i = 65; i < 75; i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
		}
	}
}
class MyThread1 extends Thread
{
	Display d;
	MyThread1(Display d) {
		this.d = d;
	}
	public void run() {
		d.displayn();
	}
}
class MyThread2 extends Thread
{
	Display d;
	MyThread2(Display d) {
		this.d = d;
	}
	public void run() {
		d.displayc();
	}
}
class SynchronizedDemo3
{
	public static void main(String...args) {
		Display d = new Display();
		MyThread1 t1 = new MyThread1(d);
		MyThread2 t2 = new MyThread2(d);
		t1.start();
		t2.start();
	}
}