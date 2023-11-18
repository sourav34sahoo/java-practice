class MethodOverridding23
{
	public void m1(int...i)
	{
		System.out.println("Parent");
	}
}
class C extends MethodOverridding23
{
	public void m1(int i)
	{
		System.out.println("child");
	}
}
class Sourav1
{
	public static void main(String...args)
	{
		MethodOverridding23 p = new MethodOverridding23();
		p.m1();
		
		C c = new C();
		c.m1();
		
		MethodOverridding23 p1 = new C();
		p1.m1();
	}
}
