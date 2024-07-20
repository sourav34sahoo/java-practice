import java.util.*;
class LinkedHashSetDemo
{
	public static void main(String...args)
	{
		LinkedHashSet l=new LinkedHashSet();
		l.add("mr");
		l.add("sourav");
		l.add("kumar");
		l.add("sahoo");
		l.add(null);
		l.add(3);
		l.add("kumar");
		System.out.println(l.add("kumar"));
		System.out.println(l);
	}
}