import java.util.*;
class Employee
{
	String name;
	int id;
	int age;
	int number;
	
	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id;
	}
	public int getAge(){
		return this.age;
	}
	public int getNumber(){
		return this.number;
	}
	
	
	Employee(String name,int id,int age,int number) 
	{
		this.name = name;
		this.id = id;
		this.age = age;
		this.number = number;
	}
	
	public String toString(){
		return "Employee { Name : "+name+"   Id : "+ id+"   Age : "+age+"   Number : "+number+ " }";
	}
}
class EmployeeDataInputjava
{
	public static void main(String...args)
	{
		Employee ed  = new Employee("ravi",  101, 36, 1541469);
	    Employee ed1 = new Employee("bisu",  107, 28, 1642627);
	    Employee ed2 = new Employee("nabi",  392, 26, 7869537);
	    Employee ed3 = new Employee("ram",   268, 46, 4682610);
	    Employee ed4 = new Employee("romu",  368, 26, 2175038);
	    Employee ed5 = new Employee("siba",  762, 27, 2185562);
	    Employee ed6 = new Employee("somu",  366, 26, 2735329);
	    Employee ed7 = new Employee("hari",  126, 56, 2451698);
	    Employee ed8 = new Employee("nag",   163, 76, 2176276);
	    Employee ed9 = new Employee("bhumi", 362, 29, 1675259);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(ed);
		empList.add(ed1);
		empList.add(ed2);
		empList.add(ed3);
		empList.add(ed4);
		empList.add(ed5);
		empList.add(ed6);
		empList.add(ed7);
		empList.add(ed8);
		empList.add(ed9);
		//System.out.println(l);
		
		for(Employee emp:empList)
		{
			System.out.println(emp);
		}
		
		Collections.sort(empList, new MyAgeComparator());
		System.out.println();
		System.out.println("=================After Age Sorting==============");
		for(Employee emp:empList)
		{
			System.out.println(emp);
		}
		
		
		Collections.sort(empList, new MyNameComparator());
		System.out.println();
		System.out.println("=================After Name Sorting==============");
		for(Employee emp:empList)
		{
			System.out.println(emp);
		}
		
		Collections.sort(empList, new MyIdComparator());
		System.out.println();
		System.out.println("===================After Id Sorting==============");
		for(Employee emp:empList)
		{
			System.out.println(emp);
		}
		
		Collections.sort(empList ,new MyNumberComparator());
		System.out.println();
		System.out.println("================After Number Sorting==================");
		for(Employee emp:empList) {
			System.out.println(emp);
		}
	}
}
class MyAgeComparator implements Comparator<Employee>
{
	public int compare(Employee emp1,Employee emp2)
	{
		if(emp1.getAge() == emp2.getAge())
			return 0;
		else if(emp1.getAge() < emp2.getAge())
			return 1;
		else 
			return -1;
		//return Integer.compare(emp1.getAge(), emp2.getAge());
	}
}

class MyNameComparator implements Comparator<Employee>
{
	public int compare(Employee emp1,Employee emp2)
	{
		return emp1.getName().compareTo(emp2.getName());
	}
}

class MyIdComparator implements Comparator<Employee>
{
	public int compare(Employee emp1,Employee emp2)
	{
		if(emp1.getId() == emp2.getId())
			return 0;
		else if(emp1.getId() > emp2.getId())
			return 1;
		else
			return -1;
		//return Integer.compare(emp1.getId(),emp2.getId());
	}
}

class MyNumberComparator implements Comparator<Employee>
{
	public int compare(Employee emp1,Employee emp2)
	{
		/*if(emp1.getNumber() == emp2.getNumber())
			return 0;
		if(emp1.getNumber() < emp2.getNumber())
			return 1;
		else
			return -1; */
		return Integer.compare(emp1.getNumber(),emp2.getNumber());
	}
}