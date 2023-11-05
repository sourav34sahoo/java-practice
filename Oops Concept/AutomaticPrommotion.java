class AutomaticPrommotion
{
	public void m1(int i)
	{
		System.out.println("int-arg");
	}
	public void m1(float f)
	{
		System.out.println("float-arg");
	}
	public static void main(String...args)
	{
		AutomaticPrommotion p = new AutomaticPrommotion();
		p.m1(18);
		p.m1(17.6f);
	}
}
