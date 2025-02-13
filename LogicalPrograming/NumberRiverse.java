import java.util.*;
class NumberRiverse
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();
		int result =0;
		
		while (no != 0) {
			int reminder = no % 10;
			result = result * 10 + reminder;
			no = no / 10;
		}
		System.out.println(result);
	}
}