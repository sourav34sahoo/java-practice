import java.util.Scanner;

public class SwitchCaseCalculator {
	
	
	public static void main(String...args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();
		
		System.out.println("which operation you want : ?");
		System.out.println("for  + operation to give : 1 ");
		System.out.println("for  - operation to give : 2 ");
		System.out.println("for  * operation to give : 3 ");
		System.out.println("for  / operation to give : 4 ");
		
		int oper = sc.nextInt();
		
		switch(oper) {
		
		case 1:
			System.out.println("result : "+ (num1+num2));
			break;
		case 2:
			System.out.println("result : "+ (num1-num2));
			break;
		case 3:
			System.out.println("result : "+ (num1*num2));
			break;
		case 4:
			if(num2 != 0 && num1 != 0) {
				System.out.println("result : "+ (num1/num2));
			} else {
				System.out.println("0 not devided by any number");
			}
		}
		sc.close();
	}
}


