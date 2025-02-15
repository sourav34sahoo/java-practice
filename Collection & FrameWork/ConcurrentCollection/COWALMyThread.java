import java.util.concurrent.*;
import java.util.*;
class COWALMyThread extends Thread
{
	
	static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println("Cild Thread Updating List");
		l.add("c");
	}
	public static void main(String...args)throws InterruptedException {
		l.add("A");
		l.add("B");
		COWALMyThread t = new COWALMyThread();
		t.start();
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			String s1 = (String)itr.next();
			System.out.println("main Thread Iterating List and current object is :"+s1);
			Thread.sleep(3000);
		}
		System.out.println(l);
	}
}
/* O/P 
main Thread Iterating List and current object is :A
Cild Thread Updating List
main Thread Iterating List and current object is :B
[A, B, c]
*/