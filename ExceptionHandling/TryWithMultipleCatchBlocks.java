class TryWithMultipleCatchBlocks
{
	public static void main(String...args) {
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
		}
		catch (ArithmeticException e){
		}
	}
}
/* error: exception ArithmeticException has already been caught
                catch (ArithmeticException e){
Here order of catch block is parent to child.
*/