import java.util.*;
class LinkedListDemo
{
	public static void main(String...args)
	{
		LinkedList l= new LinkedList();
		l.add("sourav");
		l.add(03);
		l.add(null);
		System.out.println(l);//sourav 03 null
		l.addFirst(10);
		System.out.println(l);//10 sourav 03 null
		l.addLast("sahoo");
		System.out.println(l);//10 sourav 03 null sahoo
		l.add(100);
		System.out.println(l);//10 sourav 03 null sahoo 100
		l.removeFirst();
		System.out.println(l);//sourav 03 null sahoo 100
		l.removeLast();
		System.out.println(l);//sourav 03 null sahoo
		l.getFirst();
		System.out.println(l.getFirst());//sourav
		l.getLast();
		System.out.println(l.getLast());//sahoo
		l.get(2);
		System.out.println(l.get(2));//null
		l.set(2,"kumar");
		System.out.println(l);//sourav 03 kumar sahoo
		l.indexOf(03);
		System.out.println(l.indexOf(03));//index value found 1
	}
}

