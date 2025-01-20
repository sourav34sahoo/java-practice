/*interface Test
{
	public int squareIt(int n);
}
class Demo implements Test {
	public int squareIt(int n) {
		return n*n;
	}
}
class LambdaExpressionSquareIt
{
	public static void main(String...args) {
		Demo d = new Demo();
		System.out.println(d.squareIt(3));  // 9
	}
}  */

interface Test 
{
	public int squareIt(int n);
}
class LambdaExpressionSquareIt
{
	public static void main(String...args) {
		Test t = n->n*n;
		System.out.println(t.squareIt(3));   // 9
		System.out.println(t.squareIt(6));   // 36
	}
}