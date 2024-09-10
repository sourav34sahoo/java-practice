class MyThread extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("child Thread");
		}
	}
}
class ThreadDemo
{
	public static void main(String...args)
	{
		MyThread t = new MyThread();
		t.run();
		for(int i=0; i<5; i++)
		{
			System.out.println("main Thread");
		}
	}
}
/* In the case of t.start() a new thread will be created & that Thread is 
responsible to execute run() 
->But,in the case of t.run() no new Thread will be created & run method will be
exicuted just like a normal method call
-> entire output produced by only main Thread 
*/