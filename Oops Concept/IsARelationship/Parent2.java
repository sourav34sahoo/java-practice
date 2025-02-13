class Parent2
{
	public void m1()
	{
		System.out.println("hii..");
	}
}
class Child extends Parent2
{
	public void m2()
	{
		System.out.println("Hello..");
	}
}
class Test2
{
	public static void main(String...args)
	{
		Parent2 p = new Child();
		p.m1();
		//p.m2();
	}
}
