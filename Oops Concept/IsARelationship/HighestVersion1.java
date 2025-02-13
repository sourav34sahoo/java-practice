class HighestVersion1
{
	public void m1(char ch)
	{
		System.out.println("Charcter-arg");
	}
	public void m1(long l)
	{
		System.out.println("Long-arg");
	}
	public static void main(String...args)
	{
		HighestVersion1 H = new HighestVersion1();
		H.m1('a');
		H.m1(151545);
	}
}