import java.util.*;
class StringTrimMethodDemo1
{
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your City Name");
		String name = sc.nextLine().toLowerCase().trim();
		
		if(name.equals("hyderabad")) {
			System.out.println("Hello Hyderabadi, adaab...");
		}
		else if(name.equals("chennai")) {
			System.out.println("Hello Madasi , Vanakkam...");
		}
		else if(name.equals("bangalore")) {
			System.out.println("Hello Kanadiga, Namaskara...");
		}
		else {
			System.out.println("Enter the valid city name");
		}
	}
}