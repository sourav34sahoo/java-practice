import java.util.*;
class IntroductionCase1
{
	public static void main(String...args)
	{
		ArrayList l = new ArrayList();
		l.add("durga");
		l.add("srinu");
		l.add(new Student());
		
		String name1 = (String)l.get(0);
		String name2 = (String)l.get(1);
		String name3 = (String)l.get(2);  // R.E ->ClassCastException
	}
}

/* There is no garente that collection can hold a particular type of objetcs.
hence w.r.t type collection are not safe to use. */