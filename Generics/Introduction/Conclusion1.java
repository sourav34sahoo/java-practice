import java.util.*;
class Conclusion1
{
	public static void main(String...args)
	{
		ArrayList<String> l = new ArrayList<String> ();
		
		List<String> l = new ArrayList<String>();
		
		Collection<String> l = new ArrayList<String>();
		
		List<Object> l = new ArrayList<String>(); /* C.E incompatible types: ArrayList<String> cannot be
		converted to List<Object> */
	}
}
//Usage of parent class reference to hold child class Object is considered as polymorphism.
//Polymorphism concept is is applicable only for basetype, but not for parameter type.
//here AL,List,Collection are called Basetype, and String is called parameter.