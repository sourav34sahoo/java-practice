import java.time.*;
class BothLocalDateAndTimeDemo6
{
	public static void main(String...args) {
		LocalDateTime dt = LocalDateTime.of(1995,Month.MAY,28,12,45);
		System.out.println(dt);
	}
}
/* O/P
1995-05-28T12:45
*/