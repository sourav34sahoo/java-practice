class ConstructorOverloading
{
	ConstructorOverloading(double d)
	{
		this(10);
        System.out.println("double arguments");
	}
	ConstructorOverloading(int i)
	{
		this();
		System.out.println("int argumeents");
	}
	ConstructorOverloading()
	{
		System.out.println("no arguments");
	}
	public static void main(String...args)
	{
		ConstructorOverloading c1 = new ConstructorOverloading(10.7);
		ConstructorOverloading c2 = new ConstructorOverloading(27);
		ConstructorOverloading c3 = new ConstructorOverloading();
	}
}
 