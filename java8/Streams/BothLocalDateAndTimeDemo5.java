import java.time.*;
class BothLocalDateAndTimeDemo5
{
	public static void main(String...args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yy = dt.getYear();
		System.out.printf("Date:%d-%d-%d",dd,mm,yy);
		int h = dt.getHour();
		int m = dt.getMinute();
		int s = dt.getSecond();
		int n = dt.getNano();
		System.out.printf("/nTime:%d:%d:%d:%d",h,m,s,n);
	}
}
/*O/P
2025-02-12T19:41:21.361653900
Date:12-2-2025/nTime:19:41:21:361653900
*/