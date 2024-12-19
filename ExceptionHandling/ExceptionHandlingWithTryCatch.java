class ExceptionHandlingWithTryCatch
{
	public static void main(String...args) {
		System.out.println("state1");
		try {
			System.out.println(10/0);
		} catch(ArithmeticException e) {
			System.out.println(10/2);
		}
		System.out.println("state3");
	}
}
/* O/P
state1
5
state3
*/