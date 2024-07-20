import java.util.*;
class HashSetDemo
{
	public static void main(String...args)
	{
		HashSet h=new HashSet();
		h.add("mr");
		h.add("sourav");
		h.add("kumar");
		h.add("sahoo");
		h.add(null);
		h.add(3);
		System.out.println(h.add("kumar"));
		System.out.println(h);
	}
}