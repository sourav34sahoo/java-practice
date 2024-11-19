import java.util.regex.*;
class RegExDemo1
{
	public static void main(String...args)
	{
		int count = 0;
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abbbabbba");
		while(m.find()) {
			count++;
			System.out.println(m.start()+"---"+m.end()+"---"+m.group());
		}
		System.out.println("The total number of occurrences : "+count);
	}
}
/* o/p
0---2---ab
4---6---ab
The total number of occurrences : 2
*/