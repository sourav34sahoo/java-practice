import java.util.*;
class StringTokenizerDemo1
{
	public static void main(String...args) 
	{
		StringTokenizer st = new StringTokenizer("Sourav kumar sahoo");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
/* O/P
Sourav
kumar
sahoo
The default regular expression is SPACE
*/