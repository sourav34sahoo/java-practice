import java.util.function.*;
import java.util.*;
class Employee
{
	String name;
	double salary;
	Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
}
class BiConsumerConcept
{
	public static void main(String...args) {
		ArrayList<Employee> l= new ArrayList<>();
		populate(l);
		BiConsumer<Employee,Double> c=(e,d)->e.salary=e.salary+d;
		for(Employee e:l)
		{
			c.accept(e,500.0);
		}
		for(Employee e:l) {
			System.out.println("Employee name: "+e.name);
			System.out.println("Employee salary"+e.salary);
			System.out.println();
		} 
	}
	public static void populate(ArrayList<Employee> l) {
		l.add(new Employee("Durgs",1000));
		l.add(new Employee("Sunny",2000));
		l.add(new Employee("Bunny",3000));
		l.add(new Employee("Chinny",4000));
	}
}
/* O/P
Employee name: Durgs
Employee salary1500.0

Employee name: Sunny
Employee salary2500.0

Employee name: Bunny
Employee salary3500.0

Employee name: Chinny
Employee salary4500.0
*/