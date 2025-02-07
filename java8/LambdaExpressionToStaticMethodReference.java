class LambdaExpressionToStaticMethodReference
{
	public static void m1() {
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread");
		}
	} 
	public static void main(String...args) {
		Runnable r=LambdaExpressionToStaticMethodReference::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}
}
/* O/P
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread */