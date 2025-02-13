class Constructor1
{
	static int count = 0;
	Constructor1()
	{
		count ++;
	}
	Constructor1(int i)
	{
		count ++;
	}
	public static void main(String...args)
	{
		Constructor1 s1 = new Constructor1();
		Constructor1 s2 = new Constructor1(10);
		System.out.println(s1.count);
		System.out.println(s2.count);
	}
}