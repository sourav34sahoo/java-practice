import java.util.*;
class RemoveDuplicateElementInUnSortedArray
{
	public static void main(String...args) {
		HashSet<Integer> hs = new HashSet<>();
		//int []a={1,2,2,3,4,6,8,8};   // 123468
		int []a={1,8,4,8,5,8,7,9};    // 145789
		for(int i=0; i<a.length; i++) {
			hs.add(a[i]);
		}
		for(int j:hs) {
			System.out.print(j); 
		}
	}
}