import java.text.*;
import java.util.*;
class DateTimeFormatDemo1
{
	public static void main(String...args) 
	{
		DateFormat df = DateFormat.getDateTimeInstance();
		System.out.println("US date is: "+ df.format(new Date()));   // US date is: 01-Dec-2024, 8:34:09?pm   
		
		//System.out.println("US Date is: "+ DateFormat.getDateTimeInstance(1,Locale.US).format(new Date()));   
		
		System.out.println("US Date is: "+ DateFormat.getDateTimeInstance(0,0,Locale.US).format(new Date()));    
		// US Date is: Sunday, December 1, 2024, 8:34:09?PM India Standard Time
	}
}