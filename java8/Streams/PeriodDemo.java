import java.time.*;
class PeriodDemo
{
	public static void main(String...args) {
		LocalDate birthday = LocalDate.of(2002,10,03);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday,today);
		System.out.printf("Age is %dYears %d Months %d Days",p.getYears(),p.getMonths(),p.getDays());
		
		LocalDate deathday = LocalDate.of(1989+80,06,15);
		Period p1 = Period.between(birthday,deathday);
		int d = p1.getYears()*365+p1.getMonths()*30+p1.getDays();
		System.out.printf("/n you will be on the earth only %d Days..Hurry up to do more important Things ",d);
	}
}
/* O/P
Age is 22Years 4 Months 9 Days
*/