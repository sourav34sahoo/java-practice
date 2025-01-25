interface I
{
	public void m1();
	public void m2();
	default void m3(){
		System.out.println("Default Method");
	}     
}
class DefaultMethodDemo3 implements I
{
	public void m1(){}
	public void m2(){}
}
class DefaultMethodDemo33 implements I
{
	public void m1(){}
	public void m2(){}
}