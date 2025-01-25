interface I
{
	public void m1();
	public void m2();
	public void m3();      // error
}
class DefaultMethodDemo2 implements I
{
	public void m1(){}
	public void m2(){}
}
class DefaultMethodDemo22 implements I
{
	public void m1(){}
	public void m2(){}
}