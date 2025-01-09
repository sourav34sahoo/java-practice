class StringIndexOfDemo
{
	public static void main(String...args) {
		String s ="gubigl";
		System.out.println(s.indexOf('i'));  // 3
		
		System.out.println(s.indexOf('m'));  // -1
		
		System.out.println(s.indexOf('g'));  // 0
		
		System.out.println(s.lastIndexOf('g'));  // 4
	}
}