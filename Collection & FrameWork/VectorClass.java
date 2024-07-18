import java.util.*;
class VectorClass
{
	public static void main(String...args)
	{
		Vector v = new Vector();
		System.out.println(v.capacity());
		for (int i = 1;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		v.addElement("A");
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.removeElement(5);
		System.out.println(v);
		v.removeElementAt(2);
		System.out.println(v);
		v.removeAllElements();
		System.out.println(v);
	}
}