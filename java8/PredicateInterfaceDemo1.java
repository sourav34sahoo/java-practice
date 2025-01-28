import java.util.function.*;
class PredicateInterfaceDemo1
{
	public static void main(String...args) {
		Predicate<Integer> p1= i->i%2==0;
		System.out.println(p1.test(10));   // true
		System.out.println(p1.test(15));  // false
	}
}