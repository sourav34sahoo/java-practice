import java.util.*;
import java.util.stream.*;
class FindNoOfFailedStudentsUsingCountMethod
{
	public static void main(String...args){
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(50);
		marks.add(25);
		marks.add(98);
		System.out.println(marks);
		long noOfFailedStudents = marks.stream().filter(m->m<35).count();
		System.out.println(noOfFailedStudents);		
	}
}
/*
[70, 45, 10, 65, 50, 25, 98]
2
*/