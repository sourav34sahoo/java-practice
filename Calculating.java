import java.util.*;
class Calculating
 {
	 public static void main(String[]args){
		 Scanner oprn = new Scanner(System.in);
		 System.out.println("Type ur 1st number-");
		 int num1 = oprn.nextInt();
		 
		 System.out.println("Type ur 2nd number-");
		 int num2 = oprn.nextInt();
		 
		 System.out.println("type of operation");
		 String operation = oprn.next();
		 int result;
		 if ("+".equals(operation)){
			 result = num1+num2;
			 System.out.println("Result of addition :"+ result);
		 }
		 else if ("-".equals(operation)){
			 result = num1 - num2;
			 System.out.println("Result of substraction :"+ result);
		 }
		 else if ("*".equals(operation)){
			 result = num1*num2;
			 System.out.println("Result of Multiplication :"+ result);
		 }
		 else if ("%".equals(operation)){
			 result = num1 % num2;
			 System.out.println("Result of Division :"+ result);
		 }   
	 }
 }
                                   
		 
		 
	
	