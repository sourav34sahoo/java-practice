import java.util.concurrent.*;
class CopyOnWriteArraySetDemo
{
	public static void main(String...args) {
		CopyOnWriteArraySet c = new CopyOnWriteArraySet();
		c.add("D");
		c.add("B");
		c.add("C");
		c.add("A");
		c.add(null);
		c.add(10);
		c.add("D");
		System.out.println(c);   // [D, B, C, A, null, 10]
	}
}
