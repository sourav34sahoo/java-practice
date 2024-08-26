/* For the local variables JVM won't to provide any default values
compulsary we should perform initialization before using that variables.*/
class FinalLocalVariables
{
	public static void main(String...args)
	{
		int x;
		System.out.println("Hello");  //o/p Hello
	}
}
  
  
class FinalLocalVariables
{
	public static void main(String...args)
	{
		int x;
		System.out.println(x);
	}
}     // got C.E ->variable x might not have been initialized.