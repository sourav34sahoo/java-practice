class StringBufferSetCharAt
{
	public static void main(String...args) {
		StringBuffer sb = new StringBuffer("java");
		sb.setCharAt(0,'y');
		System.out.println(sb);   // yava
	}
}