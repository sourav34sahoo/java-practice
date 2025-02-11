import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class ToArrayMethod
{
	public static void main(String...args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		Integer[] i = l.stream().toArray(Integer[]::new);
		for(Integer i1:i) 
		{
			System.out.println(i1);
		}
	}
}
/* O/P
10
0
15
5
20
*/