class RecursiveConstructor
{
	RecursiveConstructor()
	{
		this(10);
	}
	RecursiveConstructor(int i)
	{
		this();
	}
	public static void main(String...args)
	{
		System.out.println("Hello..");
	}
	
}