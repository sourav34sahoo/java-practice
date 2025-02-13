class Parent
{
	int x = 10;
	{
		m1();
		System.out.println("parent");
	}
	Parent() {
		System.out.println("parent constructor");
	}
	public static void main(String...args) {
		Parent p = new Parent();
		System.out.println("parent main");
	}
	public void m1() {
		System.out.println(y);
	}
	int y = 20;
}
class Child extends Parent
{
	int i = 100;
	{
		m2();
		System.out.println("ciib");
	}
	Child() {
		System.out.println("child constructor");
	}
	public static void main(String...args) {
		Child c = new Child();
		System.out.println("child main");
	}
	public void m2() {
		System.out.println(j);
	}
	{
		System.out.println("csiib");
	}
	int j = 200;
}