class Revise
{
	public static void main(String...args) {
		int []a = {12,26,37,45,28};
		int min=a[0];
		for(int i=1;i<a.length; i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("small no is:"+min);
	}
}