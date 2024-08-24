class AbstractVSFinal

final class A
{
	abstract void m1();
} 
// got error 

abstract class A
{
	public final void m1();
	{	
	}
}

/* abstract methods we have to override in child class to provide implementation. where as final methods can be overriden . Hence abstract final combination is illegal combination for methods.

//for abstrct class we should create child classes to provide proper implementation but for final classes we can't create child class . Hence abstract final combination is illegal for classes.
