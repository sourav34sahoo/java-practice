import java.util.*;
class IdentityHashMapDemo1
{
	public static void main(String...args)
	{
		IdentityHashMap ihm = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		ihm.put(i1,"pavan");
		ihm.put(i2,"kalyan");
		System.out.println(ihm);
	}
}