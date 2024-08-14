import java.util.*;
class PriorityQueueDemo
{
	public static void main(String...args)
	{
		PriorityQueue q = new PriorityQueue();
		//System.out.println(q.peek());  -->return head element of queue if queue is empty then return null
		//System.out.println(q.element()); -->return head element of queue if queue is empty then we will get RuntimeException 
		//System.out.println(q.poll()); -->to remove & return head element of queue if queue is empty then return null
		//System.out.println(q.remove()); --> to remove & return head element of queue if queue is empty then we will get RuntimeException 
		
		for (int i=0;i<=10;i++)
		{
			q.offer(i);
		}
		System.out.println(q);//0 1 2 3 4 5 6 7 8 9 10
		System.out.println(q.peek()); // 0
		System.out.println(q.element()); // 0
		System.out.println(q.poll()); // remove 0 & o/p 0 
		System.out.println(q.remove()); // 1
	}
}