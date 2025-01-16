import java.util.function.*;
class LambdaExpressionDemo1
{
	/* normal program 
	public static int squareAt(int n) {
		return n*n;
	}
	public static void main(String...args) {
		System.out.println("the square of 4 is"+squareAt(4));  // the square of 4 is16
		System.out.println("the square of 12 is"+squareAt(12)); // the square of 12 is144
	} */
	
	// Functional method
	public static int squareAt(int n) {
		return n*n;
	}
	public static void main(String...args) {
		Function<Integer,Integer> f=i -> i*i;
		System.out.println("the square of 4 is"+f.apply(4));  // the square of 4 is16
		System.out.println("the square of 12 is"+f.apply(12));  //the square of 12 is144
	}
}