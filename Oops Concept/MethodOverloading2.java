class MethodOverloading2
{
	public void m1(Object o)
	{
		System.out.println("object version");
	}
	public void m1(String s)
	{
		System.out.println("string version");
	}
	public static void main(String...args)
	{
		MethodOverloading2 m = new MethodOverloading2();
		m.m1(new Object());
		m.m1("sourav");
		m.m1(null);
	}
}
