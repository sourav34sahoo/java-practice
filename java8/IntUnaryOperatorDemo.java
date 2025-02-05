import java.util.function.*;
class IntUnaryOperatorDemo
{
	public static void main(String...args) {
		IntUnaryOperator f=i->i*i;
		System.out.println(f.applyAsInt(7));   // 49
	}
}