import java.util.*;
class CollectionSortDemo1
{
	public static void main(String...args)
	{
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		System.out.println("Before Sorting"+l);
		Collections.sort(l,new MyComparator());
		System.out.println("After Sorting"+l);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1 = (String)obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}