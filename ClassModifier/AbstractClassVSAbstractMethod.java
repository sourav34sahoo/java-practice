class AbstractClassVSAbstractMethod

class Test
{
	public void m1();
}
// C.E:-missing method body or declare abstract

class Test
{
	public abstract void m1()
	{
	}
}
//C.E:-abstract method can't have a body

class Test
{
	public abstract void m1();
}
//C.E:-Test is not abstract and doesn't override abstract method m1() in test.

abstract class test
{
	public abstract void m1();
	public abstract void m2();
}
class SubTest extends Test
{
	public abstract void m1()
	{}
}
//C.E:-SubTest is not abstract and doesn't override abstract method m2() in Test

//-> WE CAN HANDLE THESE C>E EITHER BY DECLARING CLASS SUBTEST AS ABSTRACT OR BY PROVIDING IMPLEMENTATION FOR m2.