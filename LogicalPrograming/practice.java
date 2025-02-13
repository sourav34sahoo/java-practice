import java.util.*;
class practice
{
	public static void main(String...args) {
		String[] s = {"java","c","c++","java","c"};
		for(int i=0; i<s.length-1; i++) {
			for(int j=i+1; j<s.length-1; j++){
				if(s[i]==s[j]) {
					System.out.println(s[i]);
				}
			}
		}
 	}
}