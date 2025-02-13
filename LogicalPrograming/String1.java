import java.util.Scanner;
class String1
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String inputStr = sc.next();
		char[] ch = inputStr.toCharArray();//['a','b','c']
		String result = "";
		for (int i = ch.length-1; i >= 0; i--) {
			//System.out.print(ch[i]);//c b a
			result = result+ch[i];//""+c= c , c+b = cb , cb +a = cba
		}
		System.out.println();
		System.out.println("Reverse String : "+ result);
	}
}