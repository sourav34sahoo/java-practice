//Method nameing conflicts
interface Left
{
	public void m1();
}
interface Right 
{
	public void m1();
}
class Test implements Left,Right
{
	public void m1()
	{
	}
}
/* If two interface contains a method with same signature & same return type in the implementation
class we can provide implementation for only one method. */