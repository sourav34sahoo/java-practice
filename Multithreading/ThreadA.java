class ThreadA
{
	public static void main(String...args)throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		synchronized(b) {
			System.out.println("main thread trying to call wait()");    // 1
			b.wait();
			System.out.println("main thread got notification");    // 4
			System.out.println(b.total);                           // 5
		}
	}
}
class ThreadB extends Thread
{
	int total = 0;
	public void run()
	{
		System.out.println("Starting run method");
		synchronized(this) {
			System.out.println("Child thread start notification");    // 2
			for(int i=1; i<=100; i++){
				total=total + i;
			}
			System.out.println("Child thread trying to given notification");   // 3
			this.notify();
		}
	}
}