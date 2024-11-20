import java.util.regex.*;
class RegExQuantifiers
{
	public static void main(String...args) {
		Pattern p = Pattern.compile("a?");
		Matcher m = p.matcher("abaabaaab");
		while(m.find()) {
			System.out.println(m.start()+"---"+m.group());
		}
	}
}
/* O/P
   x = a
0---a
2---a
3---a
5---a
6---a
7---a   
   x = a+
0---a
2---aa
5---aaa  
   x = a*
0---a
1---
2---aa
4---
5---aaa
8---
9---  
   x = a?
 0---a
1---
2---a
3---a
4---
5---a
6---a
7---a
8---
9---  
*/