import java.util.function.*;
class IntToDoubleFunctionDemo
{
	public static void main(String...args) {
		/*Function<Integer,Double> f = i->Math.sqrt(i);
		System.out.println(f.apply(7));   // 2.6457513110645907  */
		
		IntToDoubleFunction f = i->Math.sqrt(i);
		System.out.println(f.applyAsDouble(9));  // 3.0
	} 
} 