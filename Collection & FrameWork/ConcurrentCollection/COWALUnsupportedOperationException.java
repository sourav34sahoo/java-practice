import java.util.concurrent.*;
import java.util.*;
class COWALUnsupportedOperationException
{
	public static void main(String...args) {
		//ArrayList l = new ArrayList();
		CopyOnWriteArrayList l = new CopyOnWriteArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		System.out.println(l);   // [A,B,C,D]
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			String s = (String)itr.next();
			if(s.equals("D"))
				itr.remove();
		}
		System.out.println(l); // R.E -> UnsupportedOperationException
	}
}
/* O/P
ArrayList l = new ArrayList();
[A,B,C,D]    
[A,B,C]

CopyOnWriteArrayList l = new CopyOnWriteArrayList();
[A,B,C,D]     
UnsupportedOperationException
*/