import java.util.*;
class ListIteratorObject
{
	public static void main(String...args)
	{
		Vector v = new Vector();
		ListIterator litr=v.listIterator();
		System.out.println(litr.getClass().getName());	
	}
}