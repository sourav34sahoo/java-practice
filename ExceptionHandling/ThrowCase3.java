class ThrowCase3 extends RuntimeException
{
	public static void main(String...args) {
		throw new ThrowCase3();
	}
}
/*
Exception in thread "main" ThrowCase3
        at ThrowCase3.main(ThrowCase3.java:4)
*/