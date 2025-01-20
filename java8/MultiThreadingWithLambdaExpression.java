/*
class MyRunnable implements Runnable
{
	public void run(){
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
	}
}
class MultiThreadingWithLambdaExpression
{
	public static void main(String...args) {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}  */

class MultiThreadingWithLambdaExpression
{
	public static void main(String...args) {
		Runnable r = ()-> {
			for(int i=0; i<5; i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<5; i++) {
			System.out.println("Main Thread");
		}
	}
}
/* Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread */
