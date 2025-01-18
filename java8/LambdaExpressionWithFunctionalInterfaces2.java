/*
interface Test
{
	public void add(int a,int b);
}
class Demo implements Test
{
	public void add(int a,int b) {
		System.out.println("The sum is: "+(a+b));
	}
}
class LambdaExpressionWithFunctionalInterfaces2
{
	public static void main(String...args) {
		Test t = new Demo();
		t.add(10,20);    // The sum is: 30
		t.add(100,200);   // The sum is: 300
		t.add(1000,2000); // The sum is: 3000
	}
}  */

interface Test
{
	public void add(int a,int b);
}
class LambdaExpressionWithFunctionalInterfaces2
{
	public static void main(String...args) {
		Test t = (a,b)->System.out.println("The sum is: "+(a+b));
		t.add(10,20);       // The sum is: 30
		t.add(100,200);     // The sum is: 300
		t.add(1000,2000);   // The sum is: 3000
	}
}