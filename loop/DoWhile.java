class DoWhile
{
	public static void main(String[]args){
		int i = 0;
		do{
			if ( i % 2 == 0){
			System.out.println(i +" is the even number");
		}
		else{
			System.out.println(i +" is the odd number");
		}
		i++;
		}
		while( i <= 100);
	}
}

