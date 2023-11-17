import java.io.*;
class MethodOverridding18
{
	public void m1()throws IOException
	{
	}
}
class c extends MethodOverridding18
{
	public void m1()throws ArithmeticException,NullPointerException
	{
	}
}
