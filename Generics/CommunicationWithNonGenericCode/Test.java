import java.util.*;
class Test
{
	public static void main(String...args)
	{
		ArrayList<String> l = new ArrayList<String>();  // Generic area
		l.add("A");
		l.add("s");
		//l.add(10);  // error
		m1(l);
		System.out.println(l);  // [A, s, 10, 10.5, true, sita]
	}
	public static void m1(ArrayList l)  // Non-Generic area
	{
		l.add(10);
		l.add(10.5);
		l.add(true);
		l.add("sita");
	}
}