import java.io.*;
class MethodOverridding16
{
	public void m1()throws IOException 
	{
	}
}
class c extends MethodOverridding16
{
	public void m1() throws FileNotFoundException
	{
	}
}
