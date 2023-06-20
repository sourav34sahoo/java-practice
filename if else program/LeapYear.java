import java.util.*;
class LeapYear
{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		
		if ( year % 4 == 0){
			System.out.println(year +" is the Leap year!");
		}
		else{
			System.out.println(year +" is not a leap year!");
		}
	}
}

			