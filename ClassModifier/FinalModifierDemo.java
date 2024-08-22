class FinalModifierDemo
{
	public void property()
	{
		System.out.println("money+Gold+Land");
	}
	public final void marry()
	{
		System.out.println("Sourav sahoo");
	}
}
class Child extends FinalModifierDemo
{
	public void marry()
	{
		System.out.println("sourav|kumar|sahoo");
	}
}

// marry() in Child cannot override marry() in FinalModifierDemo; override method is final 