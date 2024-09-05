interface Left1
{
	public void m1();
}
interface Right2
{
	public void m1(int i);
}
class Test implements Left1,Right2
{
	public void m1()
	{
	}
	public void m1(int i)  // Overloaded methods
	{
	}
}
/* If two interfaces contains a method with same name but different args then, The implementation class we have to provide implementation for both methods & These methiods are considered as overloade method */ 