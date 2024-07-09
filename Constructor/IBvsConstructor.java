 class IBvsConstructor
 {
	 static int count =0;
	 IBvsConstructor()
	 {
		 count++;
	 }
	 IBvsConstructor(int i)
	 {
		 count++;
	 }
	 public static void main(String...args)
	 {
		 IBvsConstructor s = new IBvsConstructor();
		 IBvsConstructor s1 = new IBvsConstructor(10);
	 }
 }