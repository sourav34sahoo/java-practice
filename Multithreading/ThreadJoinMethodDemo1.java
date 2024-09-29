class MyThread extends Thread 
{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
} 
class ThreadJoinMethodDemo1
{
	public static void main(String...args)throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		t.join(10000);
		for(int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
// after 10 sec of child Thread main Thread will be executed then again the child Thread will be executed. 