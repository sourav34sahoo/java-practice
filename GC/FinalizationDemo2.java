class FinalizationDemo2
{
	public static void main(String...args) {
		FinalizationDemo2 f2 = new FinalizationDemo2();
		f2=null;
		System.gc();
		System.out.println("end of main");
	}
	public void fianlize() {
		System.out.println("finalize method call");
	}
}