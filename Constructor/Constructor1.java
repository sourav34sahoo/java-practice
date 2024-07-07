class Constructor1
{
	int rollno ;
	String name;
	
	Constructor1 (String name,int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	public static void main(String...args)
	{
		Constructor1 c = new Constructor1("sourav",101);
		Constructor1 c1 = new Constructor1("Sahoo",102);
		System.out.println(c.rollno+" "+c.name);
		System.out.println(c1.rollno+" "+c1.name);
	}
}