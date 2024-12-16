import java.util.*;
public class SwitchCaseCalculatorUsingMethod
{
	public static int Add(int a,int b) {
		return a+b;
	}
	public static int Sub(int a,int b) {
		return a-b; 
	}
	public static int Mul(int a,int b) {
		return a*b;
	}
	public static String Div(int a,int b) {
		if(a != 0 && b != 0) {
			return String.valueOf(a / b);
		} else {
			return "0 not devided by any number";
		}
	}
	
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int num1 = sc.nextInt();
		System.out.println("Enter Number 2");
		int num2 = sc.nextInt();
		
		System.out.println("print the current no to find the result");
		System.out.println("for + operation to give :1");
		System.out.println("for - operation to give :2");
		System.out.println("for * operation to give :3");
		System.out.println("for / operation to give :4");
		int operation = sc.nextInt();
		
		switch(operation) {
		case 1:
			System.out.println("Result : "+ Add(num1,num2));
			break;
		case 2:
			System.out.println("Result : "+ Sub(num1,num2));
			break;
		case 3:
			System.out.println("Result : "+ Mul(num1,num2));
			break; 
		case 4:
			System.out.println("Result : "+ Div(num1,num2));
			break;
		default: 
			System.out.println("only these four operation are allowed");
		}
		sc.close();
	}
}
