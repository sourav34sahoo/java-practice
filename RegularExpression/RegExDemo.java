import java.util.regex.*;
class RegExDemo
{
	public static void main(String...args)
	{
		int count = 0;
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abbbbabba");
		while(m.find())
		{
			count++;
			System.out.println(m.start());
		}
		System.out.println("The total number of occurrences : "+count);
	}
}