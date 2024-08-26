// At the time of declaration
class FinalStaticVariableRules
{
	final static int x=10;
}

// Inside static block
class FinalStaticVariableRules
{
	final static int x;
	static
	{
		x=10;
	}
}

// If we are performing initialization any where else we will get C.E
class FinalStaticVariableRules
{
	final static int x;
	public void m1()
	{
		x=10;
	}
}