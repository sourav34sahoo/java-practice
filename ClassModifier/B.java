package pack2;
import pack1.PublicClassDemo;
class B
{
	public static void main(String...args)
	{
		PublicClassDemo a1=new PublicClassDemo();
		a1.m1();
	}
}

/*package pack1;
public class PublicClassDemo
{
	public void m1()
	{
		System.out.println("Hello");
	}
}*/

/* if we are not declaring class PublicClassDemo as public we will get Compile time error while compiling B , saying pack1.PublicClassDemo is not public in pack1; can't be accessed from outside package8*/
 