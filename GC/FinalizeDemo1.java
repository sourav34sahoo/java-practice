class FinalizeDemo1
{
	static FinalizeDemo1 s;
	public static void main(String...args)throws Exception {
		FinalizeDemo1 f1 = new FinalizeDemo1();
		System.out.println(f1.hashCode());
		f1=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(s.hashCode());
		s=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("end of main method");
	}
	public void finalize() 
	{
		System.out.println("finalize method call");
		s=this;
	}
}
// O/p
798154996
finalize method call
798154996
end of main method