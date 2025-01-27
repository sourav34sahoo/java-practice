interface I
{
	public static void m1(){
		System.out.println("Interface static method");    
	}
}
class InterfaceStaticMethod implements I
{
	public static void main(String...args) {
		I.m1();        // Interface static method
		// m1();   error
		// InterfaceStaticMethod.m1();  error
		// InterfaceStaticMethod i = new InterfaceStaticMethod();
		// i.m1();    error
	}
}