class Constructor
{
	int rollno;
	String name;
	Constructor(int rollno,String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	public static void main(String...args)
	{
		Constructor s1 = new Constructor(101,"sourav");
		Constructor s2 = new Constructor(102,"sahoo");
		
	    System.out.println(s1.rollno);
	    System.out.println(s1.name);
	    System.out.println(s2.rollno);
	    System.out.println(s2.name);
	}
}
