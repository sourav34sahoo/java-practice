import java.util.*;
class EmployeeData1 implements Comparable
{
	String name;
	int id;
	EmployeeData1(String name,int id)
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
		EmployeeData1 ed=(EmployeeData)obj;
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
		EmployeeData1 e1=new EmployeeData1("nag",100);
		EmployeeData1 e2=new EmployeeData1("bala",200);
		EmployeeData1 e3=new EmployeeData1("chiru",50);
		EmployeeData1 e4=new EmployeeData1("venki",150);
		EmployeeData1 e5=new EmployeeData1("nag",100);
		
		TreeSet t=new TreeSet(new MyComparator());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int Compare(Object obj1,Object obj2)
	{
		EmployeeData1 e1=(EmployeeData1)obj1;
		EmployeeData1 e2=(EmployeeData1)obj2;
		return e1.compareTo(e2);
	}
}