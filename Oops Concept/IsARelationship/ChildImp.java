class ChildImp
{
	public void m1(Object o)
	{
		System.out.println("Object-arg");
	}
	public void m1(String s)
	{
		System.out.println("String-arg");
	}
	public static void main(String...args)
	{
		ChildImp c = new ChildImp();
		c.m1(new Object ());
		c.m1("String");
		c.m1(null);
	}
}