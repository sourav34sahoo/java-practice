import java.util.function.*;
class FunctionMethodDemo1
{
	public static void main(String...args) {
		Function<Integer,Integer> f = i->i*i;
		System.out.println(f.apply(10));    // 100
		System.out.println(f.apply(20));    // 200
	}
}
