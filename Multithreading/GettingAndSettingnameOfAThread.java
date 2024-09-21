class MyThread extends Thread
{
}
class GettingAndSettingnameOfAThread
{
	public static void main(String...args) {
		System.out.println(Thread.currentThread().getName());   // main  
		MyThread t = new MyThread();
		System.out.println(t.getName());    // Thread-0    ganerated by jvm
        Thread.currentThread().setName("Sourav sahoo");
        System.out.println(Thread.currentThread().getName());	// sourav sahoo	
	}
}
/* Every Thread in java has some name. It may be provided by the programmer or default 
name ganerated by jvm.
-> We can get & set name of a Thread by using the following methods of Thread class. 
*/