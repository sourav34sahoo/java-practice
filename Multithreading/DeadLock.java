class A
{
	public void d1(B b) {
		System.out.println("Thread1 starts execution d1() method");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
		}
		System.out.println("Thread1 trying to call B's last() method");
		b.last();
	}
	public void last() {
		System.out.println("Inside A this is last() method");
	}
}
class B
{
	public void d2(A a) {
		System.out.println("Thread2 starts execution d2() method");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
		}
		System.out.println("Thread2 trying to call A's last() method");
		a.last();
	}
	public void last() {
		System.out.println("Inside B this is last() method");
	}
}
class DeadLock extends Thread
{
	A a = new A();
	B b = new B();
	public void m1() {
		this.start();
		a.d1(b);        // execute by main Thread
	}
	public void run() {
		b.d2(a);         // execute by child Thread
	}
	public static void main(String...args) {
		DeadLock d = new DeadLock();
		d.m1();
	}
}

/* o/p
Thread1 starts execution d1() method
Thread2 starts execution d2() method
Thread1 trying to call B's last() method
Inside B this is last() method
Thread2 trying to call A's last() method
Inside A this is last() method
*/