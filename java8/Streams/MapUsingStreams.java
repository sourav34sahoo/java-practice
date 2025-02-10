import java.util.*;
import java.util.stream.*;
class MapUsingStreams
{
	public static void main(String...args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(0);
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		List<Integer> updateMarks = marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updateMarks);
	}
};
/* 
[0, 5, 10, 15, 20, 25]
[5, 10, 15, 20, 25, 30]
*/