class ConstructorOverloading1
{
	ConstructorOverloading1(double d)
	{
		this(10);
		System.out.println("double-args");
	}
	ConstructorOverloading1(int i)
	{
		this();
		System.out.println("int-args");
	}
	ConstructorOverloading1()
	{
		System.out.println("no-args");
	}
	public static void main(String...args)
	{
		//ConstructorOverloading1 s = new ConstructorOverloading1(23.23);
		ConstructorOverloading1 s = new ConstructorOverloading1(298);
		//ConstructorOverloading1 s = new ConstructorOverloading1();
	}
}