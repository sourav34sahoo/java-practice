class VarargMethod2
{
	public static void m1(int x)
	{
		System.out.println("General method");
	}
	public static void m1(int...x)
	{
		System.out.println("var-arg");
	}
	public static void main(String...args)
	{
		m1();
		m1(10);
		m1(10,20);
	}
}