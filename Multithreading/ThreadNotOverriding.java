class MyThread extends Thread
{
}
class ThreadNotOverriding
{
	public static void main(String...args)
	{
		MyThread t = new MyThread();
		t.start();                       // no o/p printing
	}
} 
/* if we are not overriding run() method then Thread class run()
will be executed which has empty implementation and hence we won't get any o/p. 

note->It is highly recomanded to override run() to define our job.
*/