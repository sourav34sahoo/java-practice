class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}
class ThreadImplementingRunnableInterface
{
	public static void main(String...args){
		MyRunnable mt = new MyRunnable();
	    Thread t = new Thread(mt);
	    t.start();
	    for(int i = 0; i < 10; i++){
			 System.out.println("Main Thread");
		}
	}
}
//We can't get exact o/p we will get mixing o/p