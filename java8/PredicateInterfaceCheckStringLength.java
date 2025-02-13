import java.util.function.*;
class PredicateInterfaceCheckStringLength
{
	public static void main(String...args) {
		String[] s = {"Nag","Chiranjeevi","Venkatesh","Balaiah","Sunny","Katrina","Priyanka"};
		Predicate<String> p1 = s1->s1.length()>5;
		for(String s2:s) {
			if(p1.test(s2))
			{
				System.out.println(s2);
			}
		}
	}
}