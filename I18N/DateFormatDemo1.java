import java.text.*;
import java.util.*;
class DateFormatDemo1
{
	public static void main(String...args) 
	{
		DateFormat df = DateFormat.getDateInstance(0,Locale.US);
		System.out.println(df.format(new Date()));               // Sunday, December 1, 2024
		
		DateFormat df1 = DateFormat.getDateInstance(1,Locale.US);
		System.out.println(df1.format(new Date()));               // December 1, 2024
		
		System.out.println(DateFormat.getDateInstance(2,Locale.US).format(new Date()));    // Dec 1, 2024
		
		System.out.println(DateFormat.getDateInstance(3,Locale.US).format(new Date()));    // 12/1/24
	}
}