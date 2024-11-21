import java.util.regex.*;
class RegExSplitMehod1
{
	public static void main(String...args)
	{
		Pattern p = Pattern.compile("o");
		String[] s = p.split("Durga Software Solution");
		for(String s1:s) {
			System.out.println(s1);
		}
	}
}
/* O/p
Durga S
ftware S
luti
n
*/