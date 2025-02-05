import java.util.function.*;
class UnaryOperatorDemo
{
	public static void main(String...args) {
		UnaryOperator<Integer> f=i->i*i;
		System.out.println(f.apply(6));   // 36
	}
}