class StringDemo1
{
	public static void main(String...args) {
		String s1 = new String("Sourav");
		String s2 = new String("Sourav");
		System.out.println(s1==s2);        // false
		System.out.println(s1.equals(s2)); // true
	}
}