class MyThread extends Thread
{
}
class ThreadDefaultPriority
{
	public static void main(String...args) {
		System.out.println(Thread.currentThread().getPriority());   // 5
		//Thread.currentThread().setPriority(15);  //Exception in thread "main" java.lang.IllegalArgumentException
		Thread.currentThread().setPriority(8);
		MyThread mt = new MyThread();
		System.out.println(mt.getPriority());     // 8
	}
}
// The default priority only for main Thread is 5
/* But, for all the remaining Threads it will be Inheriting from the parent, ie whatever
 parent has the same priority will be inheriting to the child. */