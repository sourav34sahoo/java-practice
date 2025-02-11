import java.util.*;
import java.util.stream.*;
class MinAndMaxElementDemo2
{
	public static void main(String...args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		System.out.println(l);
		Integer min = l.stream().min((i1,i2)-> -i1.compareTo(i2)).get();
		System.out.println(min);
		
		Integer max = l.stream().max((i1,i2)-> -i1.compareTo(i2)).get();
		System.out.println(max);
	}
}
/* O/P
[10, 0, 15, 5, 20]
20
0
*/