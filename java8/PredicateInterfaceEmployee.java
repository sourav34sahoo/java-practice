import java.util.*;
import java.util.function.*;
class Employee
{
	String name;
	double salary;
	Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
}
class PredicateInterfaceEmployee
{
	public static void main(String...args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Durga",1000));
		l.add(new Employee("Ravi",2000));
		l.add(new Employee("Shiva",3000));
		l.add(new Employee("Mahesh",4000));
		l.add(new Employee("Adarsh",5000));
		l.add(new Employee("Sagar",6000));
		
		Predicate<Employee> p =i->i.salary>3000;
		for(Employee e:l) {
			if(p.test(e)){
				System.out.println(e.name+" : "+e.salary);
			}
		}
	}
}

/* O/P
Mahesh : 4000.0
Adarsh : 5000.0
Sagar : 6000.0
*/