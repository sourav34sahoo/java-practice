class Staticflowcontrol
{
	static 
	{
		m1();
		System.out.println("FSB");
	}
	public static void main(String...args)
	{
		m1();
		System.out.println("main method");
	}
	public static void m1()
	{
		System.out.println(y);
	}
	static
	{
		m1();
		System.out.println("SSB");
	}
	static int y =20;
}

