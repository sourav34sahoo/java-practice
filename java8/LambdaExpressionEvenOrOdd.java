import java.util.function.*;
class LambdaExpressionEvenOrOdd
{
	public static void main(String...args) {
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(5));   // false
		System.out.println(p.test(20));  // true
	}
}