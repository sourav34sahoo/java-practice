import java.io.*;
class Dog implements Serializable
{
	int i=10;
	int j=20;
}
class SerializeDemo1
{
	public static void main(String...args)throws Exception {
		Dog d1 = new Dog();
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		
		System.out.println(d1.i +"....."+ d2.j);
	}
}