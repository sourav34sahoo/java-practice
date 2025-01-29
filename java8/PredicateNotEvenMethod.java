import java.util.function.*;
class PredicateNotEvenMethod
{
	public static void main(String...args){
		int[] x = {0,5,10,15,20,25,30,35};
		Predicate<Integer> p1=i-> i%2!=0;
		for(int x1:x) {
			if(p1.test(x1)) {
				System.out.println(x1);
			}
		}
	}
}
/* O/P
5
15
25
35
*/