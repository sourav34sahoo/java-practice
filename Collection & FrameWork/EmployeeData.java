import java.util.*;
class EmployeeData implements Comparable
{
	String name;
	int id;
	EmployeeData(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public String toString()
	{
		return name+"--"+id;
	}
	public int compareTo(Object obj)
	{
		int id1=this.id;
		EmployeeData ed=(EmployeeData)obj;
		int id2=ed.id;
		if(id1<id2)
		{
			return -1;
		}
		else if(id1>id2)
		{
			return 1;
		}
		else 
			return 0;
	}
}
class CompCompDemo
{
	public static void main(String...args)
	{
		EmployeeData e1=new EmployeeData("nag",100);
		EmployeeData e2=new EmployeeData("bala",200);
		EmployeeData e3=new EmployeeData("chiru",50);
		EmployeeData e4=new EmployeeData("venki",150);
		EmployeeData e5=new EmployeeData("nag",100);
		
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
	}
}
	