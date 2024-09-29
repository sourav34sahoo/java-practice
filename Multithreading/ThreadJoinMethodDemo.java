class MyThread extends Thread
{
	public void run() 
	{
		for(int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);    // line -->1
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
} 
class ThreadJoinMethodDemo
{
	public static void main(String...args)throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		t.join();
		for(int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
	}
}
/* If we are commenting line 1 then both Threads will be exicuted simultaniously 
and we can't expect exact execution order & hence can't expect exact o/p .
-> If we are not commenting line 1 then main Thread will wait untill completing child Thread
hence in this the o/p is expected. */