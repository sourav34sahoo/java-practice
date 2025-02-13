class StaticVariable1
{
    int x = 10;
	static int y = 20;
	public static void main(String...args)
	{
		StaticVariable1 s = new StaticVariable1();
		s.x=888;
		s.y=999;
		StaticVariable1 s1 = new StaticVariable1();
		System.out.println(s1.x +","+ s1.y);
	}
}