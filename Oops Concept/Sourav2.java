class MethodOverridding24
{
	int x = 888;
}
class C extends MethodOverridding24
{
	int x = 999;
}
class Sourav2
{
	public static void main(String...args)
	{
		MethodOverridding24 p = new MethodOverridding24();
		System.out.println(p.x);
		
		C c = new C();
		System.out.println(c.x);
		
		MethodOverridding24 p1 = new C();
		System.out.println(p1.x);
	}
}

		
		