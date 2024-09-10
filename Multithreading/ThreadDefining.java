class MyTherad extends Thread
{
	public void run() 
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Child Thread");
		}
	}
}
class ThreadDefining
{
	public static void main(String...args)
	{
		MyTherad mt = new MyTherad();
		mt.start();    // starting of a therad
		
		for(int i=0; i<10; i++)
		{
			System.out.println("main Thread");
		}
	}
}