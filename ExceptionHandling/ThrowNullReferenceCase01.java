class ThrowNullReferenceCase01
{
	static ArithmeticException e;
	public static void main(String...args) {
		throw e;
	}
}

/* Exception in thread "main" java.lang.NullPointerException: Cannot throw exception because "ThrowNullReferenceCase01.e" is null
        at ThrowNullReferenceCase01.main(ThrowNullReferenceCase01.java:5)
*/