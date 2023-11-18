class MethodOverridding22
{
	public static void m1(){
		System.out.println("Parent");
	}
}
class C extends MethodOverridding22
{
	public static void m1(){
		System.out.println("child");
	}
}
public class Sourav
{
	public static void main(String...args)
	{
		MethodOverridding22 p = new MethodOverridding22();
		p.m1();
		
		C c = new C();
		c.m1();
		
		MethodOverridding22 p1 = new C();
		p1.m1();
	}
}
 