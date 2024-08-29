import java.util.*;
class ArraysAsListDemo
{
	public static void main(String...args)
	{
		String[] s = {"A","Z","B"};
		List l = Arrays.asList(s);
		System.out.println(l);     // [A, Z, B]
		
		s[0]="K";
		System.out.println(l);     // [K, Z, B]
		
		l.set(1,"L");
		System.out.println(l);     // [K, L, B]
		
		for (String s1:s)
		System.out.println(s1);    // K L B
	    
		//l.add("sourav");       UnsupportedOperationException
		//l.remove(2);           UnsupportedOperationException
		l.set(1,"S");            
		System.out.println(l);    // [K, S, B]
		//l.set(1,"10");         ArrayStoreException
	}
}

// public static List asList(Object[] a)

/* By using this method we are not creating an independent List Object 
just we are creating List view for the existing Array Object.
*/