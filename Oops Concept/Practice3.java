// Instance control flow from parent 
class Practice3
{
	int x = 10;
	{
		m1();
		System.out.println("parent");
	}
	Practice3()
	{
		System.out.println("parent constructor");
	}
	public static void main(String...args)
	{
		Practice3 p = new Practice3();
		System.out.println("Parent main");
	}
	public void m1()
	{
		System.out.println(y);
	}
	int y = 20;
}
class Child extends Practice3
{
	int i = 100;
	{
		m2();
		System.out.println("child");
	}
	Child()
	{
		System.out.println("Child constructor");
	}
	public static void main(String...args)
	{
		Child c = new Child();
		System.out.println("Child main");
	}
	public void m2()
	{
		System.out.println(j);
	}
	{
		System.out.println("csiib");
	}
	int j = 200;
}
/*
run java Practice3
0
parent
Parent constructor
parent main
*/
/*
run Child class
0
parent
parent constructor
0
child
cssib
child constructor
child main
*/