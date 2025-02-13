class Student
{
	int rollno;
	String name;
	Student(int rollno,String name) 
	{
		this.rollno = rollno;
		this.name = name;
	}
	public static void main(String...srgs) {
		Student s1 = new Student(10,"muni");
		Student s2 = new Student(12,"kuni");
		System.out.println("student 1 : roll no "+ s1.rollno +" student 1 : name "+s1.name);
		System.out.println("student 1 : roll no "+ s2.rollno +" student 1 : name "+s2.name);
	}
}