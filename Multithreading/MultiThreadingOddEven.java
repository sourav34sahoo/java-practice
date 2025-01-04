class Odd extends Thread
{
	private Object odd;
	
	public Odd(Object odd) {
		this.odd = odd;
	}
	public void run() {
		for(int i=1; i<10; i++) {
			synchronized(odd) {
				if(i%2!=0) {
					System.out.println("odd number: "+i);
				}
				odd.notify();
				try {
					odd.wait();
				} catch(Exception e) {
					e.printStackTrace();
				} 
			}
		}
	}
}
class Even extends Thread
{
	private Object even;
	
	public Even(Object even) {
		this.even = even;
	}
	public void run() {
		for(int i=1; i<10; i++) {
			synchronized(even) {
				if(i%2==0) {
					System.out.println("Even number: "+i);
				}
				even.notify();
				try {
					even.wait();
				} catch(Exception e) {
					e.printStackTrace();
				} 
			}
		}
	}
}
class MultiThreadingOddEven
{
	public static void main(String...args)throws Exception {
		Object obj = new Object();
		Odd o1 = new Odd(obj);
		Even e1 = new Even(obj);
		o1.start();
		e1.start();
	}
}