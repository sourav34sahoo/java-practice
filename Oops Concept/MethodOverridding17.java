import java.io.*;
class MethodOverridding17
{
	public void m1()throws IOException
	{
	}
}
class c extends MethodOverridding17
{
	public void m1()throws EOFException,InterruptedException
	{
	}
}
