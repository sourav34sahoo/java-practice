import java.util.*;
class IteratorObject
{
	public static void main(String...args)
	{
		Vector v = new Vector();
		Iterator itr=v.iterator();
		System.out.println(itr.getClass().getName());	
	}
}