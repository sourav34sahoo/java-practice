import java.util.concurrent.*;
import java.util.*;
class COWALIntAddAllAbsent
{
	public static void main(String...args){
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");
		System.out.println(l);  // [A, B]
		
		CopyOnWriteArrayList l1 = new CopyOnWriteArrayList();
		l1.add("A");
		l1.add("C");
		System.out.println(l1);  // [A, C]
		l1.addAll(l);
		System.out.println(l1);
		
		ArrayList l2 = new ArrayList();  // [A, C, A, B]
		l2.add("A");
		l2.add("D");
		l1.addAllAbsent(l2);
		System.out.println(l2);    // [A, D]
	}
}