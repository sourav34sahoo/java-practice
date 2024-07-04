class Practice1
{
	static int x = 10;
	static
	{
		m1();
		System.out.println("base sb");
	}
	public static void main(String...args)
	{
		m1();
		System.out.println("Base main");
	}
	public static void m1()
	{
		System.out.println(y);
	}
	static
	{
		System.out.println("Sourav");
	}
	static int y = 20;
}
class Derived extends Practice1
{
	static int i = 100;
	static
	{
		m2();
		System.out.println("Dffb");
	}
	public static void main(String...args)
	{
		m2();
		System.out.println("Derived main");
	}
	public static void m2()
	{
		System.out.println(j);
	}
	static int j = 200;
}
/*
run java Practice1..
0
Base sb
sourav
20
Base main */

/*
run java Derived..
0
Base sb
sourav
0
Dffb
200
Derived main */