class Display
{
	public void wish(String name){
		for(int i = 0; i < 10; i++){
			System.out.print("Good Morning");
			try {
			Thread.sleep(2000);
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
	MyThread(Display d,String name)
	{
		this.d = d;
		this .name=name;
	}
	public void run(){
		d.wish(name);
	}
}
class SynchronizedIrregularDemo
{
	public static void main(String...args){
		Display d = new Display();
		MyThread t = new MyThread(d," : Dhoni");
		MyThread t1 = new MyThread(d," : Rohit");
		MyThread t2 = new MyThread(d," : Virat");
		t.start();
		t1.start();
		t2.start();
	}
}
/* If we are not declaring wish() method as Synchronized then both Threads will be executed 
simultaniously and we can't expect exact o/p we will get irregular o/p */