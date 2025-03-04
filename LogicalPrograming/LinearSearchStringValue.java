class LinearSearchStringValue
{
	public static void main(String...args) {
		String []a = {"sourav","kuamr","sahoo","pradhan","poki"};
		String item = "lomi";
		int temp = 0;
		for(int i = 0; i<a.length; i++){
			if(a[i].equals(item)){
				System.out.println("Element is availabke at index "+i);
				temp = temp+1;
			}
		}
		if(temp==0){
			System.out.println("Elements is not available");
		}
	}
}