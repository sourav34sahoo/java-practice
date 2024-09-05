class Left2
{
	public void m1();
}
interface Right2
{
	public int m1();
}
class Test implements Left2,Right2
{
	public void m1()
	{
	}
	public void m2()
	{
	}
}
/* If two interface contains a method with same signature but different returntypes, then it is
impossible to implement both interface at a time. */ 