import java.util.function.*;
class FunctionChaining
{
	public static void main(String...args) {
		Function<Integer,Integer> f1=i->i*2;
		Function<Integer,Integer> f2=i->i*i*i;
		System.out.println(f1.andThen(f2).apply(2));  // 64   ->first f1 followed by f2
		System.out.println(f1.compose(f2).apply(2));  // 16   ->first f2 followed by f1
	}
}