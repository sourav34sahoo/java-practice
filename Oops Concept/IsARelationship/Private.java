class Private 
{
	private void m1()
	{
		System.out.println("hii..");
	}
}
class C extends Private
{
	private void m1()
	{
		System.out.println("Hello..");
	}
}
class test
{
	public static void main(String...args)
	{
		Private c =new Private();
		c.m1();
	}
}