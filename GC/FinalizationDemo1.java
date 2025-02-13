class FinalizationDemo1
{
	public static void main(String...args) {
		String s = new String("sourav");
		s=null;
		System.out.println("end of main");    // end of main
	}
	public void fianlize(){
		System.out.println("finalized method call");
	}
}