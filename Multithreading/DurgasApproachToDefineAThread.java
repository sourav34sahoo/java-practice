class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Child Thread");
	}
}
class DurgasApproachToDefineAThread     // Not recomanded to use
{
	public static void main(String...args){
		MyThread t = new MyThread();
		Thread t1 = new Thread(t);
		t1.start();
		System.out.println("Main Thread");
	}
}