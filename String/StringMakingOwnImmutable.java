class StringMakingOwnImmutable
{
	private int i;
	StringMakingOwnImmutable(int i) {
		this.i=i;
	}
	public StringMakingOwnImmutable modify(int i) {
		if(this.i==i) {
			return this;
		} else {
			return new StringMakingOwnImmutable(i);
		}
	}
	public static void main(String...args) {
		StringMakingOwnImmutable s1 = new StringMakingOwnImmutable(10);
		StringMakingOwnImmutable s2 = s1.modify(100);
		StringMakingOwnImmutable s3 = s1.modify(10);
		
		System.out.println(s1==s2);  // false
		System.out.println(s1==s3);  // true
	}
}
 