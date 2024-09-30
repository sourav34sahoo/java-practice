class MyThread extends Thread
{
	static Thread mt;
	public void run() {
		try {
			mt.join();
		}
		catch(InterruptedException e) {}
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
	}
}
class ThreadJoinMethodDemo3
{
	public static void main(String...args)throws InterruptedException {
		MyThread.mt = Thread.currentThread();
		MyThread t = new MyThread();
		t.start();
		t.join();
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}
/* if main Thread calls join() on child Thread Objects & child Thread calls
join() on main Thread Objects then both Threads will wait forever & the program 
will be paused (this is something like DeadLock) */