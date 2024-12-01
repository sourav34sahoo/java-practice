import java.text.*;
import java.util.*;
class DateFormatDemo2
{
	public static void main(String...args) 
	{
		DateFormat df = DateFormat.getDateInstance(0,Locale.US);
		System.out.println("US date is: "+ df.format(new Date()));   // US date is: Sunday, December 1, 2024             
		
		DateFormat df1 = DateFormat.getDateInstance(1,Locale.UK);
		System.out.println("UK Date is: "+ df1.format(new Date()));    // UK Date is: 1 December 2024           
		
		System.out.println("ITALY Date is: "+ DateFormat.getDateInstance(2,Locale.ITALY).format(new Date()));    
		//ITALY Date is: 1 dic 2024
	}
}