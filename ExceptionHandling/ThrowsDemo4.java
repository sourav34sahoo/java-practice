class ThrowsDemo4
{
	public static void main(String...args)throws InterruptedException {
		doStuff();
	}
	public static void doStuff() {
		doMoreStuff();
	}
	public static void doMoreStuff() {
		Thread.sleep(3000);
	}
}
/*
unreported exception InterruptedException; must be caught or declared to be thrown
                Thread.sleep(3000);
*/