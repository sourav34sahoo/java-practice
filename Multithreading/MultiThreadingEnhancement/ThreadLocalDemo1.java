class ThreadLocalDemo1
{
	public static void main(String...args)
	{
		ThreadLocal tl = new ThreadLocal();
		System.out.println(tl.get());       // null
		tl.set("Durga");
		System.out.println(tl.get());       //Durgs
		tl.remove();
		System.out.println(tl.get());       // null
	}
}