import java.util.concurrent.*;
import java.util.*;
class COWALConcurrentModificationException
{
	public static void main(String...args) {
		//ArrayList l = new ArrayList();
		CopyOnWriteArrayList l = new CopyOnWriteArrayList();
		l.add("A");
		l.add("B");
		l.add("c");
		Iterator itr = l.iterator();
		l.add("D");
		while(itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println(s);
		}
	}
}
/* O/P
CopyOnWriteArrayList l = new CopyOnWriteArrayList();
A
B
C
ArrayList l = new ArrayList();
R.E -> ConcurrentModificationException
*/
