class FinalLocalVariables2
{
	public static void main(String...args)
	{
		m1(10,20);
	}
	public static void m1(final int x,int y)
	{
		//x=100;  ->C.E can't assign a value to final variable x
		//y=200;
		System.out.println(x+","+y);
	}
}

/*Formal parameters of a method simply access as local variables of 
that method hene a formal parameter can be declared as final.

-> If we declare a formal parameter as final within the method we can't change it's 
value otherwise we will get C.E */