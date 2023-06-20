public class PrintArray{
	
	public static void main(String [] args){
		
		int arr[] = new int[5];
		//Array value assignment
		for(int index = 0; index< arr.length; index++){
			
			arr[index] = index+5;
		}
		
		//Interate the Array values
		
		for(int index=0; index< arr.length; index++){
			
			System.out.println(arr[index]);
		}
		
		System.out.println("======= for each =============");
		for(int value : arr){
			
			System.out.println(value);
		}
		
		
	}
	
	
}