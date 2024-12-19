class TryWithMultipleCatchBlocks1
{
	public static void main(String...args) {
		try {
			System.out.println(10/0);
		}
		catch (ArithmeticException e) {
		}
		catch (Exception e){
		}
	}
}
  // Here order of catchblock is child to parent