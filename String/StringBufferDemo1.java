class StringBufferDemo1
{
	public static void main(String...args) {
		StringBuffer sb1 = new StringBuffer("sourav");
		StringBuffer sb2 = new StringBuffer("sourav");
		System.out.println(sb1==sb2);    // false
		System.out.println(sb1.equals(sb2));  // false
	}
}