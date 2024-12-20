class ThrowUnreachableStatementCase2
{
	public static void main(String...args) {
		throw new ArithmeticException("/ by zero");
		System.out.println("Hello");
	}
}
/*
ThrowUnreachableStatementCase2.java:5: error: unreachable statement
                System.out.println("Hello");
				
 After throw statement we are not allow to write any statement directly otherwise we will
 get C.E saying 'Unreachable Statement'
*/ 