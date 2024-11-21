import java.util.regex.*;
class RegExSplitMehod
{
	public static void main(String...args) 
	{
		Pattern p = Pattern.compile("\\s");
		String[] s = p.split("Sourav kumar sahoo");
		for(String s1:s) {
			System.out.println(s1);
		}
	}
}
/* O/P
Sourav
kumar
sahoo
Pattern class contains split()method to split given
String according to a regular expression.
*/