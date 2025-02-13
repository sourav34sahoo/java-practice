interface A 
{
	public int test();
}
class Practice2 implements A
{
	public int test(){
		return 10;
	}
	public static void main(String...ars) {
		Practice2 p = new Practice2();
		System.out.println(p.test());
	}
}