import java.util.function.*;
class BinaryOperatorDemo
{
	public static void main(String...args) {
		/*BiFunction<String,String,String> f =(s1,s2)->s1+s2;
		System.out.println(f.apply("sourav","sahoo"));    souravsahoo  */
		
		BinaryOperator<String> b = (s1,s2)->s1+s2;
		System.out.println(b.apply("sourav","sahoo"));  // souravsahoo
	}
}