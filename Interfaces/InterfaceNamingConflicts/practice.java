interface B
{
	public void sub(int a,int b);
	public void add(int a,int b);
	public void mul(int a,int b);
}
public class practice implements B
{
	public void sub(int a,int b){
		System.out.println(a-b);
	}
	public void add(int a,int b){
		System.out.println(a+b);
	}
	public void mul(int a,int b){
		System.out.println(a*b);
	}
	public static void main(String...args) {
		practice b1 = new practice();
		b1.sub(5,2);
		b1.add(5,3);
		b1.mul(1,7);
	}
}