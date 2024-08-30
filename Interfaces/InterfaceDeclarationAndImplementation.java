interface InterfaceDeclarationAndImplementation
{
	void m1();  // By default public abstract void m1();
	void m2();
}
abstract class ServiceProvider implements InterfaceDeclarationAndImplementation
{
	public void m1()
	{
	}
}
/*We can declare an interface by using Interface Keyword, we can implement an interface by using 
implements keyword.
 
->If a class implements an interface compulsary we should provide implementation for every method 
of that interface otherwise we have to declare class as abstract. Violation leads to C.E .

->When ever we are implementing an inaterface method compulsary it should be declare as public 
otherwise we will get C.E */ 