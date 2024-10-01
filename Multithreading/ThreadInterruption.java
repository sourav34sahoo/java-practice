class MyThread extends Thread
{
	public void run()
	{
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("I am leazy Thread");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}
class ThreadInterruption
{
	public static void main(String...args) {
		MyThread t = new MyThread();
		t.start();
		t.interrupt();   // line --> 1
		System.out.println("End of main Thread");
	}
}
/* If we are commenting line 1 then mainThread won't interrupt child Thread Hence 
both Threads will be executed untill completion
-> If we are not commenting line 1 then main Thread interrupted te child Thread raises interruptedException.
o/p
I am leazy Thread
I got Thread
End of main Thread
*/