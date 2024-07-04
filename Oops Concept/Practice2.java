class Practice2
{
	int x = 10;
	{
		m1();
		System.out.println("Fiib");
	}
	Practice2()
	{
		System.out.println("constructor");
	}
	public static void main(String...args)
	{
		Practice2 p = new Practice2();
		System.out.println("main");
	}
	public void m1()
	{
		System.out.println(y);
	}
	{
		System.out.println("siib");
	}
	int y = 20;
}
/*
0
Fiib
siib
constructor
main
*/
