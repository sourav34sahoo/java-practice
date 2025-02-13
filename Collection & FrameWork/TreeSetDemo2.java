import java.util.*;
class TreeSetDemo2
{
	public static void main(String...args)
	{
		TreeSet t = new TreeSet(new MyComparator());
		t.add("s");
		t.add("g");
		t.add("d");
		t.add("p");
		System.out.println(t);
	}
}
/*class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=(String)obj2;
		return -s1.compareTo(s2);
	}
}
*/