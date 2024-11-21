import java.util.regex.*;
class RegExSplitMethodDemo2
{
	public static void main(String...args)
	{
		Pattern p = Pattern.compile("[.]");
		String[] s = p.split("www.DurgaSoft.com");
		for(String s1:s) {
			System.out.println(s1);
		}
	}
}
/* o/p 
www
DurgaSoft
com
*/