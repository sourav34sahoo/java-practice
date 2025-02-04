import java.util.function.*;
import java.util.*;
class Employee
{
	int eno;
	String name;
	Employee(int eno,String name){
		this.eno=eno;
		this.name=name;
	}
}
class BiFunctionConcept
{
	public static void main(String...args) {
		ArrayList<Employee> l = new ArrayList<>();
		BiFunction<Integer,String,Employee> f= (eno,name)->new Employee(eno,name);
		l.add(f.apply(100,"Durga"));
		l.add(f.apply(200,"Ravi"));
		l.add(f.apply(300,"Shiva"));
		l.add(f.apply(400,"pavan"));
		for(Employee e:l) {
			System.out.println("Empoyee Number: "+e.eno);
			System.out.println("Employee Name: "+e.name);
			System.out.println();
		}
	}
}
/* O/P
Empoyee Number: 100
Employee Name: Durga

Empoyee Number: 200
Employee Name: Ravi

Empoyee Number: 300
Employee Name: Shiva

Empoyee Number: 400
Employee Name: pavan
*/