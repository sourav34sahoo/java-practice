import java.util.*;
import java.util.stream.*;
class SortedIncrementOfStringLength
{
	public static void main(String...args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("Sunny Loene");
		l.add("Kajal Agarwal");
		l.add("Prabhas");
		l.add("Anushka shetty");
		l.add("Mallika Sharawat");
		System.out.println(l);
		Comparator<String> c = (s1,s2)-> {
			int l1=s1.length();
			int l2=s2.length();
			if (l1<l2) return -1;
			else if (l1>l2) return +1;
			else return s1.compareTo(s2);
		};
		List<String> sortedList = l.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortedList);
	}
}
/* O/P
[Sunny Loene, Kajal Agarwal, Prabhas, Anushka shetty, Mallika Sharawat]
[Prabhas, Sunny Loene, Kajal Agarwal, Anushka shetty, Mallika Sharawat]
*/