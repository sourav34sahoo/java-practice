class MyThread extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("start Thread");
	}
	public void run()
	{
		System.out.println("run Thread");
	}
}
class ThreadOverridingStartCase1
{
	public static void main(String...args)
	{
		MyThread t = new MyThread();
		t.start();
		System.out.println("main Thread");
	}
}
