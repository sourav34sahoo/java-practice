import java.util.*;
import static java.util.Arrays.*;
class ArraysSearchDemo
{
	public static void main(String...args)
	{
		int []a = {10,5,20,11,6};
		Arrays.sort(a);        //sort by natural order [5,6,10,11,20]
		System.out.println(Arrays.binarySearch(a,6));    // 1
		System.out.println(Arrays.binarySearch(a,14));   // -5
		
		String[] s ={"A","Z","B"};
		Arrays.sort(s);        // sort by natural order A B Z
		System.out.println(binarySearch(s,"Z"));   // 2
		System.out.println(binarySearch(s,"S"));   // -3
		
		Arrays.sort(s,new MyComparator());
		System.out.println(binarySearch(s,"Z",new MyComparator())); // 0
		System.out.println(binarySearch(s,"S",new MyComparator())); // -2
		System.out.println(binarySearch(s,"N"));   // unpredictable result
		System.out.println(binarySearch(s,"N",new MyComparator()));  // -2
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}

// Arrays Class defines the following search method for this.

//-> public static int binarySearch(primitive[] p,primitive key)
//-> public static int binarySearch(Object[] o,Object Key)
//-> public static int binarySearch(Object[] o,Object key,Comparator c)
