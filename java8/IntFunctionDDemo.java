import java.util.function.*;
class IntFunctionDDemo
{
	public static void main(String...args) {
		/*Function<Integer,Integer> f=i->i*i;
		System.out.println(f.apply(4)); */
		
		IntFunction<Integer> f =i->i*i;
		System.out.println(f.apply(5));   // 25
	}
}