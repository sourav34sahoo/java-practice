class AssertDemo3
{
	public static void main(String...args) {
		int x = 10;
		;;;;;;;;;;;;;;;;;;;;
		assert(x > 10);
		;;;;;;;;;;;;;;;;;;;;
		System.out.println(x);
	}
}

/* O/P
   javac AssertDemo2.javac
   java AssertDemo2
   10
   because, by default assert inside the program is Disable we have to enable this
   
   java -ea AssertDemo3
   Exception in thread "main" java.lang.AssertionError
*/