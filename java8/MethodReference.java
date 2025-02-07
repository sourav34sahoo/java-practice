interface Interf 
{
	public void add(int a,int b);
}
class MethodReference
{
	public static void sum(int x,int y) {
		System.out.println("The sum:"+(x+y));
	}
	public static void main(String...args) {
		Interf i=(a,b)->System.out.println("The sum:"+(a+b));
		i.add(10,20);
		
		Interf i1 = MethodReference::sum;
		i.add(100,200);
	}
}
/* O/p
The sum:30
The sum:300
*/