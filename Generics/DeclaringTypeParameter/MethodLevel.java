class MethodLevel
{
	public <T>void m1(T t)
	{
		T ob;
	}
}
/* <T>
-> <T extends Number>
-> <T extends Runnable>
-> <T extends Number & Runnable>
-> <T extends Runnable & Comparable>
-> <T extends Number & Thread> error- at a tome we can extends only one class
-> <T extends Runnable & Thread> error- because class came to be first then interface
*/