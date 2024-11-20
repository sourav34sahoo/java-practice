import java.util.regex.*;
class RegExCharacterClassesDemo
{
	public static void main(String...args) {
		Pattern p = Pattern.compile("x");
		Matcher m = p.matcher("a3b@c4z#");
		while(m.find()) {
			System.out.println(m.start()+"--"+m.group());
		}
	}
}
/* o/p          
    x = [abc]      
0--a                
2--b
4--c
    x = [^abc]
1--3
3--@
5--4
6--z
7--#
   x = [a-z]
0--a
2--b
4--c
6--z
   x = [^a-z]
1--3
3--@
5--4
7--#  
   x = [0-9] 
1--3
5--4  
   x = [0-9,a-z,A-Z]
0--a
1--3
2--b
4--c
5--4
6--z
   x = [^0-9,a-z,A-Z]
3--@
7--#

*/