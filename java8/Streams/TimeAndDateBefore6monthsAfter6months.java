import java.time.*;
class TimeAndDateBefore6monthsAfter6months
{
	public static void main(String...args) {
		LocalDateTime dt = LocalDateTime.of(1995,Month.MAY,28,12,45);
		System.out.println(dt);
		System.out.println("After six month:"+dt.plusMonths(6));
		System.out.println("Before six month:"+dt.minusMonths(6));
	}
}
/* O/P
1995-05-28T12:45
After six month:1995-11-28T12:45
Before six month:1994-11-28T12:45
*/