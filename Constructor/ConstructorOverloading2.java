class ConstructorOverloading2
{
	ConstructorOverloading2(double d)
	{
		this(10);
		System.out.println("double-args");
	}
	ConstructorOverloading2(int i)
	{
		this();
		System.out.println("int-args");
	}
	ConstructorOverloading2()
	{
		System.out.println("no-args");
	}
	public static void main(String...args)
	{
		//ConstructorOverloading2 s = new ConstructorOverloading2(23.23);
		//ConstructorOverloading2 s = new ConstructorOverloading2(298);
		ConstructorOverloading2 s = new ConstructorOverloading2();
	}
}