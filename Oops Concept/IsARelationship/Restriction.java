class Restriction
{
	public void m1()
	{
		System.out.println("hii");
	}
}
class Child extends Restriction
{
	public final void m1()
	{
		System.out.println("hello..");
	}
}
class Rest
{
	public static void main(String...args)
	{
		Child r = new Restriction();
		r.m1();
	}
}