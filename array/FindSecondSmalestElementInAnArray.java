class FindSecondSmalestElementInAnArray
{
	public static void main(String...args) {
		int []a = {28,38,18,28,37,12};
		int temp;
		for(int i=0; i<a.length; i++){
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second smallest number is :"+a[1]);
	}
}