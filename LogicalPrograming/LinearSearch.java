class LinearSearch
{
	public static void main(String...args) {
		int []a = {3,5,2,4,6};
		int k = 4;
		for(int i=0;i<a.length; i++){
			if(a[i]==k){
				System.out.println("Element is present at "+i+" position");
			}
		}
	}
}