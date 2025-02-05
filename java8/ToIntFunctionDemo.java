import java.util.function.*;
class ToIntFunctionDemo
{
	public static void main(String...args) {
		/*Function<String,String> f = s->s.length();
		System.out.println(f.apply("durga"));   5 */
		
		ToIntFunction<String> f = s->s.length();
		System.out.println(f.applyAsInt("durga"));  // 5
	}
}