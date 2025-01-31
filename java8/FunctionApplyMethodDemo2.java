import java.util.function.*;
class FunctionApplyMethodDemo2
{
	public static void main(String...args) {
		Function<String,Integer> f = i->i.length();
		System.out.println(f.apply("souravkumarsahoo"));
	}
}