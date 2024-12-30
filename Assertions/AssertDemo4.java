class AssertDemo4
{
	public static void main(String...args) {
		int x = 10;
		;;;;;;;;;;;;;;;;;;;;
		assert(x > 10):"Here x value should be > 10 but it is not";
		;;;;;;;;;;;;;;;;;;;;
		System.out.println(x);
	}
}

/* O/P
-> Exception in thread "main" java.lang.AssertionError: Here x value should be > 10 but it is not
-> Here we have to customize our exception
*/