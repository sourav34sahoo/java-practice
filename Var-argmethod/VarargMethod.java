class VarargMethod
{
	public static void m1(int...i)
	{
		System.out.println("var-arg method");
	}
	public static void main (String...args)
	{
		m1();
		m2(10);
		m3(10,20);
		m4(10,20,30,40);
	}	
}