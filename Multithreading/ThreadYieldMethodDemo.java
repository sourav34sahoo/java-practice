class MyThread extends Thread
{
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("Child Thread");
			Thread.yield();   // line ---> 1
		}
	}
}
class ThreadYieldMethodDemo
{
	public static void main(String...args) {
		MyThread t = new MyThread();
		t.start();
		for(int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}

/* if we are commenting line 1 the both Threads will be executed simultaniously
& we can't expect exact execution order.  
-> If we are not commenting line 1 then the chance of completing main Thread first 
is high because child thread always calls yield() 
*/