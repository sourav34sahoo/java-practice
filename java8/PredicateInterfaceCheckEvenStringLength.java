import java.util.function.*;
class PredicateInterfaceCheckEvenStringLength
{
	public static void main(String...args) {
		String[] s = {"Nag","Chiranjeevi","Venkatesh","Balaiah","Katrina","sunnyy",};  //sunnyy
		Predicate<String> p1 = s1->s1.length()%2==0;
		for(String s2:s){
			if(p1.test(s2)) {
				System.out.println(s2);
			}
		}
	}
}