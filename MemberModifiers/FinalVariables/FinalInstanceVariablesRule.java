// At the time of declaration.
class FinalInstanceVariablesRule
{
	final int x=10;
}

// Inside instance block.
class FinalInstanceVariablesRule
{
	final int x;
	{
		x=10;
	}
}

// inside constructor
class FinalInstanceVariablesRule
{
	final int x;
	FinalInstanceVariablesRule()
	{
		x=10;
	}
}

// Other than these if we are perform initialization any where else we will get compiletime error.

class FinalInstanceVariablesRule
{
	final int x;
	public void m1()
	{
		x=10;
	}
}  // C.E -> Can't assign a value to final variable x. 