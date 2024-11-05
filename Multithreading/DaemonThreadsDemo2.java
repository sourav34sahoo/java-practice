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
class DaemonThreadsDemo2
{
	public static void main(String...args) {
		MyThread t = new MyThread();
		t.setDaemon(true);        //  ----- 1
		t.start();
		System.out.println("End of main Thread");
	}
}
/* If we are not commenting line(1) then main Thread is non-Daemon & child Thread Is Daemon Hence When ever main Thread 
termiates automatically child Thread will be terminated.
o/p is 
End of main Thread
Child Thread

End of main Thread

Child Thread 
End of main Thread
*/