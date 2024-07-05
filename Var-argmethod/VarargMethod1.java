class VarargMethod1
{
	public static void sum(int...x)
	{
		int total = 0;
		for (int y:x)
		{
			total = total+y;
		}
		System.out.println("The sum:" + total);
	}
	public static void main(String...args)
	{
		sum();
		sum(10);
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);
	}
}