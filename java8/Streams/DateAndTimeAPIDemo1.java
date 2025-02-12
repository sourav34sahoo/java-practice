import java.time.*;
class DateAndTimeAPIDemo1
{
	public static void main(String...args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println();
	}
}
/* O/P
2025-02-12
*/