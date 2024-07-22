import java.util.*;
class ComparableInterface
{
	public static void main(String...args)
	{
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("A"));
		System.out.println("S".compareTo("S"));
		System.out.println("F".compareTo(null));
	}
}