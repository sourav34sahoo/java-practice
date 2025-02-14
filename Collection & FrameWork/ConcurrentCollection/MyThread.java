import java.util.concurrent.*;
import java.util.*;
class MyThread extends Thread
{
	static ConcurrentHashMap m = new ConcurrentHashMap();
	public void run() {
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
		}
		System.out.println("Child THread Updating Map");
		m.put(103,"c");
	}
	public static void main(String...args)throws InterruptedException{
		m.put(101,"A");
		m.put(102,"B");
		MyThread t = new MyThread();
		t.start();
		Set s = m.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Integer i1 = (Integer)itr.next();
			System.out.print("Main Thread iterating and current entry is:"+i1+"....."+m.get(i1));
			Thread.sleep(3000);
		}
		System.out.println(m);
	}
}
/* 
Main Thread iterating and current entry is:101.....AChild THread Updating Map
Main Thread iterating and current entry is:102.....BMain Thread iterating and current entry is:103.....c{101=A, 102=B, 103=c}
*/