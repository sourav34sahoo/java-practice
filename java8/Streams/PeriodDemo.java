import java.time.*;
class PeriodDemo
{
	public static void main(String...args) {
		LocalDate birthday = LocalDate.of(2002,10,03);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday,today);
		System.out.printf("Age is %dYears %d Months %d Days",p.getYears(),p.getMonths(),p.getDays());
	}
}
/* O/P
Age is 22Years 4 Months 9 Days
*/