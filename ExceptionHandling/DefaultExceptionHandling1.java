class DefaultExceptionHandling1
{
	public static void main(String...args) {
		doStuff();
		System.out.println(10/0);
	}
	public static void doStuff() {
		doMoreStuff();
		System.out.println("hii");
	}
	public static void doMoreStuff() {
		System.out.println("Hello");
	}
}

/* o/p or Error
Hello
hii
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at DefaultExceptionHandling1.main(DefaultExceptionHandling1.java:5)
*/