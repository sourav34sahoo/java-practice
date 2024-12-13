class FinalizationDemo3
{
	public static void main(String...args) {
		FinalizationDemo3 f3 = new FinalizationDemo3();
		f3.finalize();
		f3=null;
		System.gc();
		System.out.println("end of main");
	}
	public void finalize() {
		System.out.println("finalized method called");
		System.out.println(10/0);
	}
}