import java.util.function.*;
class FunctionApplyMethodDemo3
{
	public static void main(String...args) {
		Function<String,String> f = i->i.toUpperCase();
		System.out.println(f.apply("souravkumarsahoo"));
	}
}