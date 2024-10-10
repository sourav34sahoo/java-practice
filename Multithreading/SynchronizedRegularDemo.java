class Display
{
	public synchronized void wish(String name) {
		for(int i=0; i<10; i++) {
			System.out.print("Good Morning");
			try {
				Thread.sleep(3000);
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
class SynchronizedRegularDemo
{
	public static void main(String...args) 
	{
		Display d1 = new Display();
        MyThread t1 = new MyThread(d1," : Dhoni");
        MyThread t2 = new MyThread(d1," : Rohit");
        MyThread t3 = new MyThread(d1," : Virat");
        t1.start();
        t2.start();
        t3.start();		
	}
}
/* If we declare wish() method as synchronized then Threads will 
be executed one by one so that we will get regular o/p */