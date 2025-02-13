/* import java.util.*;
class MyComparator implements Comparator<Integer>
{
	public int compare(Integer I1,Integer I2) {
		
		return (I1<I2)?-1:(I1>I2)?1:0;
		
		// These total code converted to one line using ternary operator
		if(I1<I2) {
			return -1;
		}
		else if(I1>I2) {
			return +1;
		}
		else {
			return 0;
		} 
	}
} 
class CollectionWithLambdaExpression
{
	public static void main(String...args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(5);
		l.add(20);
		l.add(15);
		l.add(30);
		System.out.println(l);  // [10, 5, 20, 15, 30]
		Collections.sort(l,new MyComparator());
		System.out.println(l);  // [5, 10, 15, 20, 30]
	}
} */

import java.util.*;
class CollectionWithLambdaExpression
{
	public static void main(String...args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(5);
		l.add(20);
		l.add(15);
		l.add(30);
		System.out.println(l);  // [10, 5, 20, 15, 30]
		Comparator<Integer> c = (I1,I2)-> (I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(l,c);
		System.out.println(l);  // [5, 10, 15, 20, 30]
	}
}