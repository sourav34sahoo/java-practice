class StringBuilderMethodChaining
{
	public static void main(String...args) {
		StringBuilder sb = new StringBuilder();
		sb.append("sourav").append("sahoo").reverse().insert(3,"mk").delete(3,5);
		System.out.println(sb);     // oohasvaruos
	}
}