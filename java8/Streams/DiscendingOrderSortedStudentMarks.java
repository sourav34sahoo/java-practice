import java.util.*;
import java.util.stream.*;
class DiscendingOrderSortedStudentMarks
{
	public static void main(String...args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		List<Integer> sortedList = marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(sortedList);
	}
}
/* O/P
[70, 45, 10, 65, 20, 25]
[70, 65, 45, 25, 20, 10]
*/