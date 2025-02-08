class Student
{
	String name;
	int rollno;
	int marks;
	int age;
	Student(String name,int rollno,int marks,int age) {
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
		this.age=age;
	}
}
interface Interf
{
	public Student get(String name,int rollno,int marks,int age);
}
class ConstructorReferenceStudent
{
	public static void main(String...args) {
		//Interf i = (name,rollno,marks,age)->new Student(name,rollno,marks,age);
		Interf i=Student::new;
	}
}