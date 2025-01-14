class StringBufferDeleteMethod
{
	public static void main(String...args) {
		StringBuffer sb =new StringBuffer("sourav");
		sb.delete(2,5);
		System.out.println(sb);  // sov
		
		sb.deleteCharAt(1);
		System.out.println(sb);  // 1
	}
}