import java.util.*;
class StringTokenizerDemo2
{
	public static void main(String...args) 
	{
		StringTokenizer st = new StringTokenizer("21-11-2024","-");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
/* O/P
21
11
2024
*/