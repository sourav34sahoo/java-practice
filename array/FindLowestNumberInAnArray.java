class FindLowestNumberInAnArray
{
	public static void main(String...args) {
		int[] a = {28,27,10,37,26};
		int min = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Lowest number is: "+min);
	}
}
/* O/P
Lowest number is: 10
*/