class ArrayElementAssignment
{
	public static void main(String...aegs)
	{
		int[] a=new int[10];
		a[0] =10;
		a[1]='a';
		
		byte b = 10;
		a[2] = b;
		
		short s = 20;
		a[3] = s;
		// a[4]=10l;  C:E- found long , required int.
	}
}