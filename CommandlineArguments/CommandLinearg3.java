class CommandLinearg3
{
	public static void main(String...args)
	{
		String[] argh ={"A","B"};
		args = argh;
		for (String s1 : args)
		{
			System.out.println(s1);
		}
	}
}