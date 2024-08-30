import java.util.*;
class CollectionRetrival
{
	public static void main(String...args)
	{
		ArrayList l = new ArrayList();
		l.add("sourav");
		
		String name1 =l.get(0);   //C.E->incompatible types: Object cannot be converted to String
	}
}

// But String name1=(String)l.get(0);
/*But in the case of Collections at the time of retrival compulsary we should
perform TypeCasting otherwise we will get CompiletimeError. */