import java.util.*;

class Employee
{
	private int id;
	private String name;
	private String addr;
	private int mobile;
	
	public int getId(){
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getAddr() {
		return this.addr;
	}
	public int getMobile(){
		return this.mobile;
	}
	
	Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	
	Employee(int id,String name,String addr,int mobile) {
		this.id=id;
		this.name=name;
		this.addr=addr;
		this.mobile=mobile;
	}
	public String toString() {
		return "Id is: "+id+" Name is: "+name+" Addr is: "+addr+" Mobile is: "+mobile ;
	}
}
public class EcoEmployee
{
	public static void main(String...args) {
		Employee e1 = new Employee(101,"sourav");
		Employee e2 = new Employee(102,"sahoo","OD",47565);
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		for(Employee e:al){
			System.out.println(e);
		}
		
	}
}