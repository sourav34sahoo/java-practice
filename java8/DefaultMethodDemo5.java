interface Left
{
	default void m1() {
		System.out.println("left interface m1 method");
	}
}
interface Right
{
	default void m1(){
		System.out.println("right interface m1 method");
	}
}
class DefaultMethodDemo5 implements Left,Right
{
	public void m1() {
		//System.out.println("Our own m1 method");       -> Our own m1 method
		//Left.super.m1();    -> left interface m1 method
		//Right.super.m1();    -> right interface m1 method  
	}
	public static void main(String...args) {
		DefaultMethodDemo5 df = new DefaultMethodDemo5();
		df.m1();                    
	}
}