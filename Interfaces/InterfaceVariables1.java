interface InterfaceVariables1
{
	int x =10;
}
class Test implements InterfaceVariables1
{
	public static void main(String...args)
	{
		x = 888;
		System.out.println(x);
	}
}
/* Inside implementation classes we can acccess interface variables 
but we can't modify there values. */