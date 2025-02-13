class Signature
{
	public void m1(int i)
	{
		System.out.println("int-arg");
	}
	public void m1(float f)
	{
		System.out.println("float-arg");
	}
	public static void main (String...args)
	{
		Signature s = new Signature();
		s.m1(35232);
		s.m1(14.5f);
	}
}
