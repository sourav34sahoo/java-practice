class StringBufferEnsureCapacity
{
	public static void main(String...args) {
		StringBuffer sb = new StringBuffer();
		sb.ensureCapacity(1000);
		System.out.println(sb.capacity());
	}
}