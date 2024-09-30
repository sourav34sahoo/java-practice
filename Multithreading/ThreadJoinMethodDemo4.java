class ThreadJoinMethodDemo4
{
	public static void main(String...args)throws InterruptedException
	{
		Thread.currentThread().join();
	}
}
/* If a thread calls join() on the same Thread itself then the program will be stocked
(this is something like DeadLock) in this case Thread has to wait infanite amount of time. */