import java.util.*;
class TimesTable
{
	public static void main(String... args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int s = sc.nextInt();
		
		for(int x = 1; x <= 10; x++){
			int result = s * x;
			System.out.println( s + " * " + x + " = "+ result);
		}
	}
}
		