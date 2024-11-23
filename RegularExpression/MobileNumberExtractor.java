import java.io.*;
import java.util.regex.*;
class MobileNumberExtractor
{
	public static void main(String...args)
	{
		PrintWriter out = new PrintWriter("Output.txt");
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String line = br.readLine();
		while(line != null) 
		{
			Matcher m = p.matcher(line);
			while(m.find()){
				System.out.println(m.group());
			}
			line = br.readLine();
		}
		out.flush();
	}
}
