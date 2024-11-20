import java.util.regex.*;
class RegExPredefined_CharacterClassesDemo
{
	public static void main(String...args) {
		Pattern p = Pattern.compile("x");
		Matcher m = p.matcher("a7b K@9z");
		while(m.find()) {
			System.out.println(m.start()+"----"+m.group());
		}
	}
}
/* O/p
   x = \\s
3----
   x = \\S
 0----a
1----7
2----b
4----K
5----@
6----9
7----z
   x = \\d 
1----7
6----9 
   x = \\D
0----a
2----b
3----
4----K
5----@
7----z
   x = \\w 
0----a
1----7
2----b
4----K
6----9
7----z
   x = \\W 
3----
5----@
   x = .   
0----a
1----7
2----b
3----
4----K
5----@
6----9
7----z
*/