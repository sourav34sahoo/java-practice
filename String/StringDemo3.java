class StringDemo3
{
	public static void main(String...args) {
		String s = new String("sourav"); 
		String s1 = s.toUpperCase();
		String s2 = s.toLowerCase();
		System.out.println(s==s1);    // false
		System.out.println(s==s2);    // true
	}
}