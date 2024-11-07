class MyThread extends Thread
{
	MyThread(ThreadGroup g,String name) {
		super(g,name);
	}
	public void run() {
		System.out.println("child Thread");      // child Thread     child Thread  2 time print
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e){}
	}
} 
class ThreadGroupDemo3
{
	public static void main(String...args)throws Exception
	{
		ThreadGroup pg = new ThreadGroup("ParentGroup");
		ThreadGroup cg = new ThreadGroup(pg,"ThreadGroup");
		MyThread t1 = new MyThread(pg,"childThread1");
		MyThread t2 = new MyThread(pg,"childThread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());    // 2
		System.out.println(pg.activeGroupCount());  // 1
		pg.list();
		Thread.sleep(5000);
		System.out.println(pg.activeCount());      // 0
		System.out.println(pg.activeGroupCount());  // 1
		pg.list();
	}
}