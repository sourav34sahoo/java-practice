class ExceptionHandlingWithoutTryCatch
{
	public static void main(String...args) {
		System.out.println("state1");
		System.out.println(10/0);
		System.out.println("state3");
	}
}
 /* O/P
 state1
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionHandlingWithoutTryCatch.main(ExceptionHandlingWithoutTryCatch.java:5)
*/