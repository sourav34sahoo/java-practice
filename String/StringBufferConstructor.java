class StringBufferConstructor
{
	public static void main(String...args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());     // 16
		
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());    // 16
		
		sb.append("u");
		System.out.println(sb.capacity());   // 34   (16+1)*2
		
		sb.append("abcdefghijklmnopq");
		System.out.println(sb.capacity());   // 34
		
		sb.append("z");
		System.out.println(sb.capacity());   // 70  (cc+1)*2
	}
}