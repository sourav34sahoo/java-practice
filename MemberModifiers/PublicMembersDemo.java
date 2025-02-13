package pack1;
class PublicMembersDemo
{
	public void m1()
	{
		System.out.println("hii..");
	}
}
// Compile -> javac -d . PublicMembersDemo.java 


package pack2;
import pack1.PublicMembersDemo;
class B
{
	public static void main(String...args)
	{
		PublicMembersDemo PMD = new PublicMembersDemo();
		PMD.m1();   // got error 
	}
}

//javac -d . B.java
// java pack2.B

// Eventhrough m1() method is public , we can't acces m1() from outside of pack1 because the coresponding class PublicMembersDemo is not declare as public . if both are public then only we can access.