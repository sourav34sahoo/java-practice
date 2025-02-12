import java.time.*;
class DateAndTimeAPIDemo3
{
	public static void main(String...args) {
		LocalTime time = LocalTime.now();
		int h = time.getHour();
		int m = time.getMinute();
        int s = time.getSecond();
		int n = time.getNano();
		System.out.printf("%d:%d:%d:%d",h,m,s,n);
	}
}
/* O/P
11:43:38:678551900
*/