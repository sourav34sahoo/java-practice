class TryCatchCase4
{
	public static void main(String...args) {
		try {
			System.out.println("hii");
		}
		catch(InterruptedException e) {		
		}
	}
}
/* 
exception InterruptedException is never thrown in body of corresponding try statement
                catch(InterruptedException e) {
*/