class Test2<T extends Runnable>
{
	public static void main(String...args)
	{
		Test2<Runnable> t1 = new Test2<Runnable>();
		Test2<Thread> t2 = new Test2<Thread>();
		//Test2<Integer> t3 = new Test2<Integer>(); C.E  type argument Integer is not within bounds of type-variable T
	}
}
