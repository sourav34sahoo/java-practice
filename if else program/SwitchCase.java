import java.util.*;
class SwitchCase
{
	public static void main(String... args)
	{
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the age");
		//int age = sc.nextInt();
		int age = Integer.parseInt(args[0]);
		int age1 = Integer.parseInt(args[1]);
		int age2 = Integer.parseInt(args[3]);
		
		switch(age){
			case 18:
			     System.out.println("He or she is able to drive");
				 break;
			case 35:
			     System.out.println("He or she is a mature driver");
				 break;
			default :
				System.out.println("He or she is not a good driver");
			
		}
	}
}	
// 1 -> Sunday
// 2 -> Monday --- 7 "Please enter nunber between 1 to 7 to get the exact Day"	