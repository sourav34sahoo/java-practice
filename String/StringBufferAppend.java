class StringBufferAppend
{
	public static void main(String...args) {
		StringBuffer sb = new StringBuffer();
		sb.append("PI value is");
		sb.append(22.33);
		sb.append("It is exactly");
		sb.append(true);
		System.out.println(sb);   // PI value is22.33It is exactlytrue
	}
}