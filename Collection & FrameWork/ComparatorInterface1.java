import java.util.*;
class ComparatorInterface1
{
	public static void main(String...args)
	{
		TreeSet t = new TreeSet(new MyComparator());
		t.add(20);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(10);
		System.out.println(t);
	}
}
class MyComparator123 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		if (I1<I2)
			return +1;
		else if(I1>I2)
			return -1;
		else 
			return 0;
	}
}
