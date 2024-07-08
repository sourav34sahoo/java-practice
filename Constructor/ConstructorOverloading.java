class ConstructorOverloading
{
	ConstructorOverloading(double d)
	{
		this(10);
		System.out.println("double-args");
	}
	ConstructorOverloading(int i)
	{
		this();
		System.out.println("int-args");
	}
	ConstructorOverloading()
	{
		System.out.println("no-args");
	}
	public static void main(String...args)
	{
		ConstructorOverloading c = new ConstructorOverloading(10.72);
		//ConstructorOverloading c = new ConstructorOverloading(10);
		//ConstructorOverloading c = new ConstructorOverloading();
	}
}