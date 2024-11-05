class MyThread extends Thread 
{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
			}
		}
	}
}
class DaemonThreadsDemo1
{
	public static void main(String...args) {
		MyThread t = new MyThread();
		// t.setDaemon(true);          ----- 1
		t.start();
		System.out.println("End of main Thread");
	}
}
/* If we are commenting line(1) then both main & child Threads are non-Daemon & hence 
both will be executed untill their completion. 
o/p is 
End of main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
*/