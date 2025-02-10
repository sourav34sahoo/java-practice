import java.util.*;
import java.util.stream.*;
class FindEvenNoUsingStreams
{
	public static void main(String...args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		System.out.println(al);
		List<Integer> l2 = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}
}
/*
[0, 5, 10, 15, 20, 25]
[0, 10, 20]  */