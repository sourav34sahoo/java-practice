class AssertDemo6
{
	public static void main(String...args) {
		int x = 10;
		;;;;;;;;;;;;;;;;;;;;
		assert(x > 10):m1();
		;;;;;;;;;;;;;;;;;;;;
		System.out.println(x);
	}
	public static int m1() {
		return 666;
	}
}

/* O/P
   javac AssertDemo5.javac
   java AssertDemo2
   10
   
   java -ea AssertDemo5
   Exception in thread "main" java.lang.AssertionError: 666
*/