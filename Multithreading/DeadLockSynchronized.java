class M 
{
	public synchronized void d1(N n) {
		System.out.println("Thread1 start execution d1() method");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
		}
		System.out.println("Thread trying to call B's last() method");
		n.last();
	}
	public synchronized void last(){
		System.out.println("Inside M this is last() method");
	} 
}
class N
{
	public synchronized void d2(M m) {
		System.out.println("Thread2 start execution d2() method");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e){		
		}
		System.out.println("Thread trying to call A's last() method");
		m.last();
	}
	public synchronized void last() {
		System.out.println("Inside N this is last() method");
	}
}
class DeadLockSynchronized extends Thread
{
	M m = new M();
	N n = new N();
	public void m1() {
		this.start();
		m.d1(n);
	}
	public void run() {
		n.d2(m);
	}
	public static void main(String...args) {
		DeadLockSynchronized ds = new DeadLockSynchronized();
		ds.m1();
	}
}
 
/* o/p
Thread1 start execution d1() method
Thread2 start execution d2() method
Thread trying to call B's last() method
Thread trying to call A's last() method

after that blinking continiously _
*/