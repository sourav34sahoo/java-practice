class Gen<T>
{
	T ob;
	Gen(T ob)
	{
		this.ob=ob;
	}
	public void show()
	{
		System.out.println("The type of ob is:" + ob.getClass().getName());
	}
	public T getOb()
	{
		return ob;
	}
}
class GenDemo
{
	public static void main(String...args)
	{
		Gen<String> g1 = new Gen<String>("Sourav");
		g1.show(); // the type of ob is: java.lang.String
		System.out.println(g1.getOb());  // Sourav
		
		Gen<Integer> g2 = new Gen<Integer>(100);
		g2.show(); // the type of ob is: java.lang.Integer
		System.out.println(g2.getOb());  // 100
		
		Gen<Double> g3 = new Gen<Double>(10.18);
		g3.show(); // the type of ob is: java.lang.Double
		System.out.println(g3.getOb());  // 10.18
	}
}