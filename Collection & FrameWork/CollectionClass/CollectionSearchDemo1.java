import java.util.*;
class CollectionSearchDemo1
{
	public static void main(String...args)
	{
		ArrayList l = new ArrayList();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		System.out.println(l);                           // [15, 0, 20, 10, 5]
		Collections.sort(l,new MyComparator());
		System.out.println(l);                           // [20, 15, 10, 5, 0]
		System.out.println(Collections.binarySearch (l,10,new MyComparator()));  // 2		
		System.out.println(Collections.binarySearch (l,13,new MyComparator()));  // -3 
		System.out.println(Collections.binarySearch (l,17)); // -6 Unpredictable
		System.out.println(Collections.binarySearch (l,17,new MyComparator()));  // -2
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return i2.compareTo(i1);
	}
}

/* public static int binarySearch(List l,Object key,Comparator c)
If the List is sorted according to Comparator Then we have to use This method*/

/* If the List is sorted according to Comparator then at the time of search also we should 
pass the Same Comparator otherwise we will get Unpredictable results. */ 
