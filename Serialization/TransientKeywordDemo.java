import java.io.*;
class Dog implements Serializable
{
 	 transient int i=10;   
	 transient int j=20;   
}
class TransientKeywordDemo
{
	public static void main(String...args)throws Exception {
		Dog d1 = new Dog();
		
		FileOutputStream fos = new FileOutputStream("def.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("def.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		
		System.out.println(d2.i +"....."+ d2.j);   // 0.....0
	}
}