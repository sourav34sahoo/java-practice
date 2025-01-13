class StringBufferCharAt
{
	public static void main(String...args) {
		StringBuffer sb = new StringBuffer("Sourav");
		System.out.println(sb.charAt(3));   // r
		System.out.println(sb.charAt(20));  // StringIndexOutOfBoundsException
	}
}