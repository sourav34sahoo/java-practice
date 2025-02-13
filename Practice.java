class Practice
{
	public static void main(String args[]){
		
	int[] a = {40,32,13,25,26,9,90};
	//create a loop iterate though the array
	printOddOrEven(a);
	}//end main()
	
 public boolean static isOddOrEven(int number){
	  if(number % 2 == 0){
		return true;
	}else{
	return false;
	}
  }
  
   public boolean static printOddOrEven(int[] a){
	 for(int i=0; i< a.length; i++){
		System.out.println(i +" is even " + isOddOrEven(i));
	//check for even or odd condion
	
	}
  }
}
//9 13 25

//Array sorting 
//Array reverse
// 

//[40, 32, 13, 25, 26,9, 90]
//Print odd or even 
// 40 is even true
//32 is even true
//13 is even false