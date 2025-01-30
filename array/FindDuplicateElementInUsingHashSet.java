import java.util.*;
class FindDuplicateElementInUsingHashSet
{
	public static void main(String...args) {
		String[] s = {"java","c","c++","python","java"};
		HashSet<String> hs = new HashSet<String>();
		boolean str = false;
		for(String s1:s) {
			if(hs.add(s1)==false) {
				System.out.println("Duplicate no is :"+s1);
				str=true;
			}
		}
	}
}