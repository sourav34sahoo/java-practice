import java.util.*;
class TreeSetDemo1
{
	public static void main(String...args)
	{
		TreeSet s=new TreeSet();
		s.add(new StringBuffer("A"));
		s.add(new StringBuffer("F"));
		s.add(new StringBuffer("C"));
		s.add(new StringBuffer("Z"));
		System.out.println(s);
	}
}