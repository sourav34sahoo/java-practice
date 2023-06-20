class PrintNumber
{
	public static void main(String... args){
		for (int i=1; i<=10;i++){
			System.out.println(i);
		}
		System.out.println(" ============= While Loop==============");
		//Wile loop
		int i = 1;
		while(i<=10){
			System.out.println(i);
			i++	;		
		}
		
		System.out.println(" =============Do While Loop==============");
		int j = 1;
		do{
		 System.out.println(j);
			j++;
		}while(j <=10);
	}
}