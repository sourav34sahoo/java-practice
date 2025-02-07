class LambdaExpressionToInstanceMethodReference
{
	public void m1() {
		for(int i=0;i<3;i++) {
			System.out.println("Child Thread");
		}
	}
	public static void main(String...args) {
		LambdaExpressionToInstanceMethodReference l = new LambdaExpressionToInstanceMethodReference();
		Runnable r = l::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<3;i++) {
			System.out.println("Main Thread");
		}
	}
}
/* O/P
Main Thread
Main Thread
Main Thread
Child Thread
Child Thread
Child Thread */