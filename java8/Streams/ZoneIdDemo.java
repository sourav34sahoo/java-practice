import java.time.*;
class ZoneIdDemo
{
	public static void main(String...args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		ZoneId ia = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(ia);
		System.out.println(zt);
	}
}
/* O/P 
Asia/Calcutta
2025-02-13T05:10:29.336226500-08:00[America/Los_Angeles]
*/