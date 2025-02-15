import java.util.concurrent.*;
class COWALBooleanAddIfAbsent
{
	public static void main(String...args) {
		CopyOnWriteArrayList c = new CopyOnWriteArrayList();
		c.add("A");
		c.add("A");
		c.addIfAbsent("B");
		c.addIfAbsent("B");
		System.out.println(c);    // [A, A, B]
	}
}
