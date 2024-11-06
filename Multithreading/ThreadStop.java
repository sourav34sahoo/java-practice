class MyThread extends Thread
{
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Lazy Thread");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
			}
		}
	}
}
class ThreadStop 
{
	public static void main(String...args) {
		MyThread t = new MyThread();
		t.start();
		System.out.println("End of main Thread");
		t.stop();
	}
}
/* A Thread can stop or kill another Thread by using stop() method then automatically 
running Thread will entered into DeadState. It is a deprecated method & hence not recomanded to use
*/