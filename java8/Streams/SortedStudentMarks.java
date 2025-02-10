import java.util.*;
import java.util.stream.*;
class SortedStudentMarks
{
	public static void main(String...args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}
}
/* O/P
[70, 45, 10, 65, 20, 25]
[10, 20, 25, 45, 65, 70]
*/