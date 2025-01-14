class StringBufferInsertMethod
{
	public static void main(String...args) {
		StringBuffer sb = new StringBuffer("sourav");
		sb.insert(2,45.6);
		System.out.println(sb);
		sb.insert(3,"mk");
		System.out.println(sb);
	}
}