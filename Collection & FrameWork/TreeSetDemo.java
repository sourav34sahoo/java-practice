import java.util.*;
class TreeSetDemo
{
	public static void main(String...args)
	{
		TreeSet s=new TreeSet();
		s.add("A");
		s.add("a");
		s.add("B");
		s.add("M");
		s.add("C");
		/*t.add(new Integer(10));  we will get compiletime error said Class cast Exception bcz haterogenious object not allowed.*/
        /* t.add(null);  here we find null point exception bcz for the empty tree set add first element null insertion is always possible,but after inserting that null,if we are trying to insert ant other we will get NullPointException(NPE).*/ 
		
		System.out.println(s);
	}
}