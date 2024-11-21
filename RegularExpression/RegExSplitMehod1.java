import java.util.regex.*;
class RegExSplitMehod1
{
	public static void main(String...args)
	{
		Pattern p = Pattern.compile("o");
		String[] s = p.split("Sourav kumar sahoo");
	}
}