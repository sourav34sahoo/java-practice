class ThreadGroupDemo2
{
	public static void main(String...args) 
	{
		ThreadGroup g1 = new ThreadGroup("First Group");
		System.out.println(g1.getParent().getName());         // main
		ThreadGroup g2 = new ThreadGroup(g1,"SecondGroup");
		System.out.println(g2.getParent().getName());          // First Group
	}
}