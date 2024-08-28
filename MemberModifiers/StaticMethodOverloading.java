class StaticMethodOverloading
{
	public static void main(String...args)
	{
		System.out.println("String[]");
	}
	public static void main(int[] args)
	{
		System.out.println("int[]");
	}
}

/* For a static methods overloading concept is applicable hence within the same class 
we can declare 2 main methods with different argument. */

/* But JVM always call string argument main method only the other main method
we have to call explicity just like a normal method call. */