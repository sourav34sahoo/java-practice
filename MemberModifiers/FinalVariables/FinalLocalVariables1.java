/* Eventhough local variables declare as the final it is not required to
perform initialization if we are not using that variable.*/

class FinalLocalVariables1
{
	public static void main(String...args)
	{
		final int x;
		System.out.println("Hello SAHOO");
	}
}

/* The only aplicable modifier for local variable is final. if we are 
using any other modifier we will get C.E
public int x =10;   C.E
private int x =10;  C.E
static int x=10;    C.E
protected int x=10; C.E
final int x = 10;
*/