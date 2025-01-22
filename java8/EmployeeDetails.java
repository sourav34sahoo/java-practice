import java.util.*;
class Employee
{
	String name;
	int eno;
	
	Employee(String name,int eno) {
		this.name=name;
		this.eno=eno;
	}
	public String toString() {
		return name +":"+ eno;
	}
}
class EmployeeDetails
{
	public static void main(String...args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("sourav",8734));
		l.add(new Employee("kumar",3257));
		l.add(new Employee("sahoo",6432));
		l.add(new Employee("rimi",1679));
		System.out.println(l);  // [sourav:8734, kumar:3257, sahoo:6432, rimi:1679]
		
		//Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));  
		                         // [kumar:3257, rimi:1679, sahoo:6432, sourav:8734]
		
		//Collections.sort(l,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0); 
		                        // [rimi:1679, kumar:3257, sahoo:6432, sourav:8734]
		System.out.println(l);  
	}
}