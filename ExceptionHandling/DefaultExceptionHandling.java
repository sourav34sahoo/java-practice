class DefaultExceptionHandling
{
	public static void main(String...args) {
		doStuff();
	}
	public static void doStuff() {
		doMoreStuff();
	}
	public static void doMoreStuff() {
		System.out.println(10/0);
	}
}

/* Error 
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at DefaultExceptionHandling.doMoreStuff(DefaultExceptionHandling.java:10)
        at DefaultExceptionHandling.doStuff(DefaultExceptionHandling.java:7)
        at DefaultExceptionHandling.main(DefaultExceptionHandling.java:4)
		
* If any exception raised ,the method in which it is raised is
responsible to create exception object by including the following information
   1- Name of exception 
   2- discription of exception
   3- location of exception (Stack trace)   
*/