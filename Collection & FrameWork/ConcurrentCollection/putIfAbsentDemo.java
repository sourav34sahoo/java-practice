import java.util.concurrent.ConcurrentHashMap;
class putIfAbsentDemo
{
	public static void main(String...args){
		ConcurrentHashMap m = new ConcurrentHashMap();
		m.put(101,"Durga");
		m.put(101,"Ravi");
		System.out.println(m);  // {101=Ravi}
		m.putIfAbsent(101,"siva");
		System.out.println(m);  // {101=Ravi}
	}
}