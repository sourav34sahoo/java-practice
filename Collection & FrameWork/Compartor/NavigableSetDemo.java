import java.util.*;
class NavigableSetDemo
{
	public static void main(String...args)
	{
		TreeSet<Integer> t = new TreeSet<Integer>();
	    t.add(1000);
	    t.add(2000);
	    t.add(3000);
	    t.add(4000);
	    t.add(5000);
	    System.out.println(t); //[1000 2000 3000 4000 5000]   ( DNSO )
	    System.out.println(t.ceiling(4000)); // 4000  ( >=e)
	    System.out.println(t.higher(3000)); // 4000   (>e)
	    System.out.println(t.floor(4000)); // 4000    (<=e)
	    System.out.println(t.lower(3000)); // 2000    (<e)
	    System.out.println(t.pollFirst()); // 1000     remove & return first element.
	    System.out.println(t.pollLast()); // 5000   remove & return last element.
	    System.out.println(t.descendingSet());  // [4000 3000 2000]
		System.out.println(t); //2000 3000 4000
	}
}