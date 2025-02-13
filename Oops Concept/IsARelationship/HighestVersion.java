class HighestVersion
{
	public void m1(StringBuffer sb)
	{
		System.out.println("StringBuffer-arg");
	}
	public void m1(String s)
	{
		System.out.println("String-arg");
	}
	public static void main (String...args)
	{
		HighestVersion h = new HighestVersion();
		h.m1(new StringBuffer("StringBuffer-arg"));
		h.m1("Sourav");
		//h.m1(null);
	}
}