class CustomerThread extends Thread
{
	static Integer custId = 0;
	private static ThreadLocal tl = new ThreadLocal()
	{
		protected Integer initialValue()
		{
			return ++custId;
		}
	};
	CustomerThread(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"executing with customer id :"+ tl.get());
	}
}
class ThreadLocalDemo2
{
	public static void main(String...args) 
	{
		CustomerThread c1 = new CustomerThread("customer Thread-1");
		CustomerThread c2 = new CustomerThread("customer Thread-2");
		CustomerThread c3 = new CustomerThread("customer Thread-3");
		CustomerThread c4 = new CustomerThread("customer Thread-4");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}
}
/* In the above program for every customer Thread a separate Customer Id will 
be maintained by ThreadLocal Object
o/p 
customer Thread-2executing with customer id :2
customer Thread-3executing with customer id :3
customer Thread-4executing with customer id :4
customer Thread-1executing with customer id :1
*/