class HelloThread extends Thread
{
	private Object helloObj;
	
	public HelloThread(Object helloObj){
		this.helloObj= helloObj;
	}
	
	public void run() {
		for(int i=0; i<10; i++){
			
			synchronized(helloObj){
				System.out.println(Thread.currentThread().getName() +" : Hello");
				helloObj.notify();
			try {
				helloObj.wait();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			}
		}
	}
}

class HiThread extends Thread
{
	private Object hiObj;
	
	public HiThread(Object hiObj){
		this.hiObj= hiObj;
	}
	public void run() {
		for(int i=0; i<10; i++){
			synchronized(hiObj){
			System.out.println(Thread.currentThread().getName()+" : Hi");
			hiObj.notify();
			try {
				hiObj.wait();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		}
	}
}
class Practice
{
	public static void main(String...args)throws Exception {
		Object obj = new Object();
		HelloThread t1 = new HelloThread(obj);
		t1.setName("Hello Thread");
		HiThread t2 = new HiThread(obj);
		t2.setName("Hi Thread");
		t1.start();
		t2.start();
	}
}