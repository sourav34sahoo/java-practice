class Parent3
{
	public void m1()
	{
		System.out.println("Hii..");
	}
}
class Child extends Parent3
{
	public void m2()
	{
		System.out.println("Hello");
	}
}
class Test
{
	public static void main(String...args)
	{
		Child c = new Parent3();
		c.m1();
		c.m2();
	}
}
