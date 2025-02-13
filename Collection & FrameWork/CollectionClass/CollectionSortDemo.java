import java.util.*;
class CollectionSortDemo
{
	public static void main(String...args)
	{
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		//l.add(new Integer(10));  -->CCE
		//l.add(null);  -->NPE
		System.out.println("Before Sorting"+l); //[Z A K N]
		Collections.sort(l);
		System.out.println("After Sorting"+l);  //[A K N Z]
	}
}