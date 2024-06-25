class Parent1
{
	public void m1()
	{
		System.out.println("Hiii..");
	}
}
class Child extends Parent1
{
	public void m2()
	{
		System.out.println("Hello..");
	}
}
class Test1
{
	public static void main(String...args)
	{
		Child c = new Child();
		c.m1();
		c.m2();
	}
}
