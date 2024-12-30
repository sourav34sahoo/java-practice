class AssertDemo5
{
	public static void main(String...args) {
		int x = 10;
		;;;;;;;;;;;;;;;;;;;;
		assert(x == 10):++x;
		;;;;;;;;;;;;;;;;;;;;
		System.out.println(x);
	}
}

/* O/P
   javac AssertDemo5.javac
   java AssertDemo2
   10
   
   java -ea AssertDemo5
   10
*/