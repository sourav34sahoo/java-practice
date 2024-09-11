class MyThread extends Thread
{
	public void start()
	{
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run method");
	}
}
class ThreadOverridingStart
{
	public static void main(String...args)
	{
		MyThread t = new MyThread();
		t.start();
		System.out.println("main Thread");
	}
}
/* If we are override start() method then start() method will be exicuted just like a normal method call & no new Thread will be created. */ 
