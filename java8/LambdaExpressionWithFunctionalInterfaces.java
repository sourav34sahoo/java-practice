/*
interface Interf
{
	public void m1();
} 
class Demo implements Interf
{
	public void m1(){
		System.out.println("Hello.. Lambda Expression");
	}
}
class LambdaExpressionWithFunctionalInterfaces
{
	public static void main(String...args) {
		Demo d = new Demo();
		d.m1();    // Hello.. Lambda Expression
	}
} */

/*
interface Interf
{
	public void m1();
} 
class Demo implements Interf
{
	public void m1(){
		System.out.println("Hello.. Lambda Expression");
	}
}
class LambdaExpressionWithFunctionalInterfaces
{
	public static void main(String...args) {
		Interf i= new Demo();                 // parent class reference can be used to hold child class Object
		i.m1();    // Hello.. Lambda Expression
	}
} */

interface Interf
{
	public void m1();
}
class LambdaExpressionWithFunctionalInterfaces
{
	public static void main(String...args) {
		Interf i = () -> System.out.println("Hello.. Lambda Expression");
		i.m1();   // Hello.. Lambda Expression
		i.m1();   // Hello.. Lambda Expression 
	}
}
