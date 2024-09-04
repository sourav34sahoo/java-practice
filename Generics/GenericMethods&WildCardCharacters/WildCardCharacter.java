import java.util.*;
class WildCardCharacter
{
	public static void main(String...args)
	{
		//ArrayList<String> l = new ArrayList<String>(); // Valid Declaration
		//ArrayList<?> l = new ArrayList<String>();  // Valid Declaration 
		//ArrayList<? extends String> l = new ArrayList<String>(); // Valid Declaration
		//ArrayList<? super String> l = new ArrayList<String>(); // Valid Declaration
		//ArrayList<? extends Object> l = new ArrayList<String>();  // Valid Declaration
		//ArrayList<? extends Number> l = new ArrayList<Integer>(); //Valid Declaration
		/*ArrayList<? extends Number> l = new ArrayList<String>(); // C.E  incompatible types: 
		ArrayList<String> cannot be converted to ArrayList<? extends Number> */
		//ArrayList<?> l= new ArrayList<?>(); // C.E  unexpected type
		ArrayList<?> l = new ArrayList<? extends Number>();
	}
}