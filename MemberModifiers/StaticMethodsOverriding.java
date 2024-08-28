class StaticMethodsOverriding
{
	public static void main(String... args)
	{
		System.out.println("Parent Main");
	}
}
class C extends StaticMethodsOverriding
{
	public static void main(String...args)
	{
		System.out.println("Child Main");
	}
}
 
/* It seems that overriding concept is not applicable for static methods,
but it is not Overriding, it is method hiding.
*/
// if Run java StaticMethodsOverriding  o/p Parent Main
// Run java C o/p Child Main