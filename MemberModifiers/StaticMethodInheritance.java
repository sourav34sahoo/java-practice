class StaticMethodInheritance
{
	public static void main(String...args)
	{
		System.out.println("Parent Class");
	}
}
class C extends StaticMethodInheritance
{
}
 
/* Inheritance concept is applicable for static methods including main() method hence,while executing 
child class if the child doesn't contain main method then the parent class main method will be exicuted. 
*/ 
// if Run java StaticMethodInheritance  o/p Parent Class.
// Run java C o/p Parrent Class.