class Test
{
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
		Test t = new Test();
		//t.m1();
		t.m1(10);
		t.m1(1.3f);
	}
}