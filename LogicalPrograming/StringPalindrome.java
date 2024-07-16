import java.util.*;
class StringPalindrome
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String inputstr = sc.next();
		String result = "";
		
		char[] ch = inputstr.toCharArray();
		for (int i =ch.length-1;i>=0;i--)
		{
			result = result+ch[i];
			System.out.print(ch[i]);
		}
		if (inputstr.equals(result))
		{
			System.out.print(" is a string palindrome");
		}
		else
		{
			System.out.print(" is not a string palindrome");
		}
	}
}