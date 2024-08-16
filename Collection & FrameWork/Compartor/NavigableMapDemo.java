import java.util.*;
class NavigableMapDemo
{
	public static void main(String...args)
	{
		TreeMap<String,String> t = new TreeMap<String,String>();
		t.put("A","Apple");
		t.put("B","Ball");
		t.put("G","Goat");
		t.put("M","Monkey");
		t.put("P","Petrol");
		System.out.println(t); // {A=Apple,B=Ball,G=Goat,M=Monkey,P=Petrol}
		System.out.println(t.ceilingKey("D")); // G
		System.out.println(t.higherKey("C")); //  G
		System.out.println(t.floorKey("E")); //  B
		System.out.println(t.lowerKey("F")); // B
		System.out.println(t.pollFirstEntry()); // A=Apple
		System.out.println(t.pollLastEntry()); //  P=Petrol
		System.out.println(t.descendingMap()); //  {M=Monkey,G=Goat,B=Ball}
		System.out.println(t); //{B=Ball,G=Goat,M=Monkey}
	}
}