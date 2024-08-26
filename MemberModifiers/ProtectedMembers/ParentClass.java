package pack1;
public class ParentClass
{
	protected void m1()
	{
		System.out.println("The most misunderstood modifier in java");
	}
}
class B extends ParentClass
{
	public static void main(String...args)
	{
		ParentClass a = new ParentClass();
		a.m1();
		B b = new B();
		b.m1();
		ParentClass a1 = new B();
		a1.m1();
	}
}

//If a member declare as protected then we can access that member within the current package anyehere but outside package only in child classes.
