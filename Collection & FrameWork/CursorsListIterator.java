import java.util.*;
class CursorsListIterator
{
	public static void main(String...args)
	{
		LinkedList l = new LinkedList();
		l.add("mr");
		l.add("sourav");
		l.add("kumar");
		l.add("Sahoo");
		System.out.println(l);
		ListIterator litr=l.listIterator();
		while(litr.hasNext())
		{
			String s=(String)litr.next();
			if(s.equals("sourav"))
			{
				litr.remove();
			}
			else if(s.equals("kumar"))
			{
				litr.set("Middle Name");
			}
			else if(s.equals("Sahoo"))
			{
				litr.add("Last Name");
			}	
		}
		System.out.println(l);
	}
}