class MyThread extends Thread
{
	public void run()
	{
		System.out.println("no-arg run() method");  //no-arg run() method
	}
	public void run(int i)
	{
		System.out.println("int-arg run() method");
	}
}
class ThreadOverloading
{
	public static void main(String...args)
	{
		MyThread t = new MyThread();
		t.start();
	}
}
/* Overloading of the run() method is possible,but Thread class start() will 
always call no arrgument run() method only. but the other run() method we have 
to call explicitly just like a normal method call. */ 