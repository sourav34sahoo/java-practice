class FindLargestNumberInAnArray
{
	public static void main(String...args) {
		int []a = {10,28,38,4,10,25};
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("max number is :"+ max);
	}
}
/* O/P
max number is :38
*/