import java.util.*;
class Conclusion2
{
	public void m1(ArrayList<String> l)  //m1(ArrayList l)
	{
	}
	public void m1(ArrayList<Integer> l)  // m1(ArrayList l)
	// name clash: m1(ArrayList<Integer>) and m1(ArrayList<String>) have the same erasure
	{
	}
}
/* At Compiletime
->Compile code normally by considering Generic syntax (ArrayList<String> l),(ArrayList<Integer> l
->Remove generic syntax m1(ArrayList l), m1(ArrayList l)
-> Compile Once again resultant code.
*/
