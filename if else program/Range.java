import java.util.*;
class Range{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the range");
		int range = sc.nextInt();
		
		if (range >= num1 && range <= num2){
			System.out.println("yes "+range +" is between the two number"+num1+"-"+num2);
		}
		else{
			System.out.println("out of range");
		}
	}
}
