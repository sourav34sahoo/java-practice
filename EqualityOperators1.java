class EqualityOperators1
{
	public static void main(String... args){
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = t1;
		System.out.println(t3 == t1);
	}
}
