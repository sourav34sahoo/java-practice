import java.util.*;
class Conclusion1
{
	public static void main(String...args)
	{
		ArrayList l = new ArrayList<String>();
		l.add("A");
		l.add(10);
		l.add(true);
		l.add("Sahoo");
		System.out.println(l);
	}
}
/*  Generics concept is applicable only at Compiletime to [rovide type safety & to resolve type casting
problems. At Rumtime there is no suchtype of concept.Hence the following declaration are
->AL l = new AL();
->AL l = new AL<String>();
->AL l = new AL<Integer>();
*/