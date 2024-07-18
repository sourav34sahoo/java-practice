import java.util.*;
class StackClass
{
	public static void main(String...args)
	{
		Stack s = new Stack();
		s.push("s");
		s.push("o");
		s.push("u");
		s.push("r");
		s.push("a");
		s.push("v");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.peek();
		System.out.println(s.peek());
		System.out.println(s.search("a"));
		System.out.println(s.search("v"));
	}
}