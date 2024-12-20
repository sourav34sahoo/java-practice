class ThrowNullReferenceCase1
{
	static ArithmeticException e = new ArithmeticException();
	public static void main(String...args) {
		throw e;
	}
}

/*
Exception in thread "main" java.lang.ArithmeticException
        at ThrowNullReferenceCase1.<clinit>(ThrowNullReferenceCase1.java:3)
*/ 