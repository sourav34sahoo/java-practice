import java.util.concurrent.ConcurrentHashMap;
class ConcurrentHashMapBooleanReplace
{
	public static void main(String...args)  {
		ConcurrentHashMap m = new ConcurrentHashMap();
		m.put(101,"Durga");
		m.replace(101,"Ravi","Siva");
		System.out.println(m);    // {101=Durga}
		m.replace(101,"Durga","Ravi");
		System.out.println(m);     // {101=Rani}
	}
}