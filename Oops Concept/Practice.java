class Practice
{
	static int x = 10;
	static 
	{
		m1();
		System.out.println("sourav");
	}
	public static void main(String...args)
	{
		m1();
		System.out.println("Main method");
	}
	public static void m1()
	{
		System.out.println(y);
	}
	static
	{
		System.out.println("sahoo");
	}
	static int y = 20;
}
/*0
sourav
sahoo
20
main method */