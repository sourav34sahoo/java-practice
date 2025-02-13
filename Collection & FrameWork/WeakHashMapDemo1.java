import java.util.*;
class WeakHashMapDemo1
{
	public static void main(String...args)
	{
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t,"sourav");
		System.out.println(m);
		t=null;
		System.gc();
		//Thread.sleep(5000);
		System.out.println(m);
	}
}
class Temp
{
	public String toString()
	{
		return "temp";
	}
	public void finalize()
	{
		System.out.println("finalize method called");
	}
}
