import java.io.*;
class ThrowsDemo1
{
	public static void main(String...args) {
		PrintWriter pw = new PrintWriter("ABC.txt");
		System.out.println("hello");
	}
}
/* 
unreported exception FileNotFoundException; must be caught or declared to be thrown
                PrintWriter pw = new PrintWriter("ABC.txt");
*/