class StringBufferTrimToSize
{
	public static void main(String...args) {
		StringBuffer sb = new StringBuffer(1000);
		sb.append("ABC");
		System.out.println(sb.capacity());   // 1000
		sb.trimToSize();
		System.out.println(sb.capacity());   // 3
	}
}