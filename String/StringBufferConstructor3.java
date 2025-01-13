class StringBufferConstructor3
{
	public static void main(String...args) {
		StringBuffer sb = new StringBuffer("sourav");
		System.out.println(sb.capacity());     // 21   cc + s.length()
	}
}