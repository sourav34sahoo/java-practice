class VarargMethod3
{
	public static void m1(int...x)
	{
		System.out.pritln("var -arg");
	}
	public static void m1(int x)
	{
		System.out.println("General method");
	}
	public static void main(String...args)
	{
		m1(10);
		m1();
	}
}