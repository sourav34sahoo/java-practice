interface I
{
	default void m1() {
		System.out.println("Default method");
	}
}
class DefaultMethodDemo4 implements I
{
	public void m1() {
		System.out.println("Overriding version of default method");
	}
	public static void main(String...args) {
		DefaultMethodDemo4 t = new DefaultMethodDemo4();
		t.m1();
	}
}
/* O/P
Overriding version of default method 
*/