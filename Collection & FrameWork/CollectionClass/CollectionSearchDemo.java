import java.util.*;
class CollectionSearchDemo
{
	public static void main(String...args)
	{
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");
		System.out.println(l);  //[Z, A, M, K, a]
		Collections.sort(l);
		System.out.println(l);  //[A, K, M, Z, a]
		System.out.println(Collections.binarySearch(l,"Z")); // 3
		System.out.println(Collections.binarySearch(l,"J")); // -2
		System.out.println(Collections.binarySearch(l,"x")); // -6
	}
}

/* public static int binarySearch(List l,Object obj)
If the list is sorted according to natural sorting order then we have to use this method.

->Successfull search returns index.
->UnSucessfull  search returns insertion point.
*/ 