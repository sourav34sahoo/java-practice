class Display
{
	public void wish(String name){
		for(int i =0; i<10; i++){
			System.out.print("Good Morning");
			try {
				Thread.sleep(1500);
			}
			catch(InterruptedException e){}
			System.out.println(name);
		}
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name){
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}
}
class SynchronizedDemo1
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
/* Eventhough wish() method is synchronized we will get irregular o/p because, 
threads are operating on different java object.

->reason : If multiple Threads are operating on multiple on same java object the Synchronization is required
if multiple Threads are operating on multiple java objects the synchronization is not required.
*/