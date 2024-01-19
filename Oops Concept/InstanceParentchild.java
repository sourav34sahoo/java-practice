class InstanceParentchild
{
	int x = 10;
	{
		m1();
		System.out.println("parent");
	}
	InstanceParentchild()
	{
		System.out.println("Parent constructor");
	}
	public static void main (String...args)
	{
		InstanceParentchild p = new InstanceParentchild();
		System.out.println("parent main");
	}
	public void m1()
	{
		System.out.println(y);
	}
	int y = 20;
}
class Instancechild extends InstanceParentchild
{
	int i = 100;
	{
		m2();
		System.out.println("CIIB");
	}
	Instancechild()
	{
		System.out.println("child Constructor");
	}
	public static void main(String...args)
	{
		Instancechild c = new Instancechild();
		System.out.println("child main");
	}
	public void m2()
	{
		System.out.println(j);
	}
	{
		System.out.println("SIIB");
	}
	int j = 200;
}
