import java.util.Arrays;
import java.util.Comparator;
class ArraysSortDemo
{
	public static void main(String...args)
	{
		int[] a ={10,5,20,11,6};
		System.out.println("primitive Array before sorting");
		for (int a1 : a)
		{
			System.out.println(a1);    // 10 5 20 11 6
		}
		Arrays.sort(a);
		System.out.println("primitive Array after sorting");
		for (int a1 : a)
		{
			System.out.println(a1);   // 5 6 10 11 20
		}
		
		String[] s = {"A","Z","B"};
		System.out.println("Object Array before sorting");
		for (String a2 : s)
		{
			System.out.println(a2);   // A Z B
		}
		Arrays.sort(s);
		System.out.println("Object Array before sorting");
		for (String a1 : s)
		{
			System.out.println(a1);   // A B Z
		}
		
		Arrays.sort(s,new MyComparator());
		System.out.println("Object Array after sorting by comparator");
		for (String a1 : s)
		{
			System.out.println(a1);
		}
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1 =obj1.toString();
		String s2 =obj2.toString();
		return s2.compareTo(s1);
	}
}

// Arrays class defines the following methods to sort element of Primitive & Object type Array.

/*public static void sort(primitive[] p)
To sort elements of primitive Array according to D.N.S.O */

/*public static void sort(Object[] a)
-> To sort elements of Object Array according to D.N.S.O
-> In this case compulsary the elements should be Homogenious & Comparable otherwise 
we will get ClassCastException.*/

/*public static void sort(Object[] a,Comparator c)
To sort elements of object[] according to customized sorting order */