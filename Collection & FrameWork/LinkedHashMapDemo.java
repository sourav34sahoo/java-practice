import java.util.*;
class LinkedHashMapDemo
{
	public static void main(String...args)
	{
		LinkedHashMap m = new LinkedHashMap();
		m.put("chiranjeevi",700);
		m.put("balaiah",800);
		m.put("venkatesh",200);
		m.put("nagarjuna",500);
		System.out.println(m);
		System.out.println(m.put("chiranjeevi",1000));
		
		Set s = m.keySet();
		System.out.println(s);
		
		Collection c = m.values();
		System.out.println(c);
		
		Set s1 = m.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while (itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getkey() +"---"+ m1.getvalues());
			if (m1.getkey().equals("nagarjuna"))
				m1.setvalue(10000);
		}
		System.out.println(m);
	}
}