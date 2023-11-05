class MethodOverloading1
{
	public void m1(StringBuffer sb)
	{
		System.out.println("StringBuffer-arg");
	}
	public void m1(String s)
	{
		System.out.println("string-version");
	}
	public static void main (String...args)
	{
		MethodOverloading1 m = new MethodOverloading1();
		m.m1(new StringBuffer("sourav"));
		m.m1("sourav");
		m.m1(null);
	}
}
