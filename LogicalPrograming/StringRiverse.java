import java.util.Scanner;
class StringRiverse
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String inputstr = sc.next();
		String result = "";
		char[] ch = inputstr.toCharArray();
		
		for (int i = ch.length-1; i >= 0; i--){
			System.out.print(ch[i]); 
		}
	}
}

