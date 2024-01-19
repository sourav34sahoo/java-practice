class Instancecontrolflow
{
	int x = 10;
	{
		m1();
		System.out.println("FIIB");
	}
	Instancecontrolflow()
	{
		System.out.println("constructor");
	}
	public static void main(String...args)
	{
		Instancecontrolflow I = new Instancecontrolflow();
		System.out.println("main");
	}
	public void m1()
	{
		System.out.println(y);
	}
	{
		System.out.println("SIIB");
	}
	int y = 20;
}