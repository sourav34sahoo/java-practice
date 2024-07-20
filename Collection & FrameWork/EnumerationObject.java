import java.util.*;
class EnumerationObject
{
	public static void main(String...args)
	{
		Vector v = new Vector();
		Enumeration e = v.elements();
		System.out.println(e.getClass().getName());	
	}
}