class ArrForLoop
{
	public static void main(String...args){
		int arr[] = {46,35,6454,6454,2653,363,2636,36536};
		
		for( int i=0; i < arr.length; i++){
			if (i % 2 == 0){
				System.out.println(arr [i] +" is  even number"); 
			}
			else{
				System.out.println(arr [i] +" is odd number");
			}
		}
	}
}
  			