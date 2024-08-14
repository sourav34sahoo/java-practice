import java.util.*;
class PriorityQueueDemo2
{
	public static void main(String...args)
	{
		PriorityQueue q = new PriorityQueue(20,new MyComparator());
		for (int i=0;i<=10;i++)
		{
			q.offer(i);
		}
		System.out.println(q);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer s1=(Integer)obj1;
		Integer s2=(Integer)obj2;
		return s2.compareTo(s1);
	}
}