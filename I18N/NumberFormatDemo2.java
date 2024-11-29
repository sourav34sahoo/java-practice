import java.text.*;
import java.util.*;
class NumberFormatDemo2
{
	public static void main(String...args)
	{
		double d = 123456.789;
		Locale india = new Locale("pa","IN");
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(india);
		String s1 = nf1.format(d);
		System.out.println("india notation is: "+s1);    // india notation is: ?123,456.79 
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
		String s2 = nf2.format(d);
		System.out.println("us notation is: "+s2);      // us notation is: $123,456.79
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.UK);
		String s3 = nf3.format(d);
		System.out.println("uk notation is: "+s3);       // uk notation is: £123,456.79
		
	}
}