class StringClassSplitMethod
{
	public static void main(String...args)
	{
		String s ="www.durgsjoobs.com";
		String[] s1 = s.split("\\.");
		for(String s2:s1) {
			System.out.println(s2);
		}
	}
}
/*O/P
www
durgsjoobs
com
Pattern class Split() can take target String as arrgumentwhere as String class split() 
can take regular expression as arrgument.  
*/