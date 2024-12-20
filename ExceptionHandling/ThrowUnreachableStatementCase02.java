class ThrowUnreachableStatementCase02
{
	public static void main(String...args) {
		System.out.println(10/0);
		System.out.println("Hello");
	}
}
/* 
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ThrowUnreachableStatementCase02.main(ThrowUnreachableStatementCase02.java:4)
*/