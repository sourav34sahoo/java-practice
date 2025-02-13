import java.util.*;
class PalindromeNo
{
	public static void main (String...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int Originalno = sc.nextInt();
		int result = 0;
        int no = Originalno; 		
		
		while (no != 0){
			int reminder = no % 10;
			result = result * 10 + reminder;
			no = no / 10;
		}
        System.out.println(result);
		if (result == Originalno){
			System.out.println(Originalno + "is a palindrome no");
		}
		else {
			System.out.println(Originalno +" not a Palindrome no");
		}
	}
}

 