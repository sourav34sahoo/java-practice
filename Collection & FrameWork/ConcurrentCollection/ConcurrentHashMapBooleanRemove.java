import java.util.concurrent.ConcurrentHashMap;
class ConcurrentHashMapBooleanRemove
{
	public static void main(String...args) {
		ConcurrentHashMap<Integer,String> m = new ConcurrentHashMap<>();
		m.put(101,"Durga");
		m.remove(101,"Ravi");
		System.out.println(m);  // {101=Durga}
		m.remove(101,"Durga");
		System.out.println(m);  // {}
	}
}