import java.util.*;
import java.io.*;
class PropertiesDemo
{
	public static void main(String...args)
	{
		try{
		
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("1");
		System.out.println(s);
		p.setProperty("nag","99999");
		FileOutputStream fos = new FileOutputStream("abc.properties");
		p.store(fos,"updated by sourav for SCJP Demo class");	
		}catch(Exception e){
			System.out.println(e);	
		}
	}
}