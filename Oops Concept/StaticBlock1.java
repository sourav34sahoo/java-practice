class StaticBlock1
{
	static int x = m1();
	public static int m1()
	{
		System.out.println("Hello.. i can print");
		System.exit(0);
		return 10;
	}
}