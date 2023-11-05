class HasA
{
	public void m1()
	{
		System.out.println("no-arg");
	}
	public void m1(int i)
	{
		System.out.println("int-arg");
	}
	public void m1(float f)
	{
		System.out.println("float-arg");
	}
	public static void main(String...args)
	{
		HasA s = new HasA();
		s.m1();
		s.m1(10);
		s.m1(10.5f);
	}
}

		
		