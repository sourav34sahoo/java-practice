class FinalVsImmutable
{
	public static void main(String...args) {
		final StringBuffer sb = new StringBuffer("sourav");
		sb.append("sahoo");
		System.out.println(sb);  //souravsahoo		
		sb = new StringBuffer("kumar");
	}
}

// using final we can't reasign the reference variable  to any new object