import java.util.concurrent.*;
class PrintJob implements Runnable
{
	String name;
	PrintJob(String name) {
		this.name=name;
	}
	public void run() {
		System.out.println(name+"...job started by Threads:"+ Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
		}
		System.out.println(name+ "...job completed by Thread:"+Thread.currentThread().getName());
	}
}
class ExecutorDemo
{
	public static void main(String...args) 
	{
		PrintJob[] jobs = {new PrintJob("durgs"),new PrintJob("Ravi"),new PrintJob("Shiva"),new PrintJob("Pavan"),
        new PrintJob("Suresh"),new PrintJob("Anil")};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(PrintJob job:jobs){
			service.submit(job);
		}
		service.shutdown();
	}
}