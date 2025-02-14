class FindSecondLargestElementInAnArray
{
	public static void main(String...args) {
		int []a = {4,7,8,5,9,3,2};
		int temp;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("second highest no is :"+ a[1]);
	}
}
// second highest no is :8
