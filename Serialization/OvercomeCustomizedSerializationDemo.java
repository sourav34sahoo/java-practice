import java.io.*;
class Account implements Serializable
{
	String uname = "sourav";
	transient String pwd = "sahoo";
	private void writeObject(ObjectOutputStream os)throws Exception{
		os.defaultWriteObject();
		String epwd = "123"+pwd;
		os.writeObject(epwd);
	}
	private void readObject(ObjectInputStream is)throws Exception{
		is.defaultReadObject();
		String epwd = (String)is.readObject();
		pwd = epwd.substring(3);
	}
}
class OvercomeCustomizedSerializationDemo
{
	public static void main(String...args)throws Exception {
		Account a1 = new Account();
		System.out.println(a1.uname+"....."+a1.pwd);
		
		FileOutputStream fos = new FileOutputStream("def.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis = new FileInputStream("def.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account)ois.readObject();
		System.out.println(a2.uname+"...."+a2.pwd);
	}
}
/* O/P
sourav.....sahoo
sourav....sahoo
*/