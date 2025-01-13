import java.util.*;
public class ArmstrongNumber
{
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		boolean isArmstrong = checkForArmstrongNumber(num);
		if(isArmstrong) {
			System.out.println(num +" is a armstrong number");
		}
		else {
			System.out.println(num +" is not a armstrong number");
		}
		sc.close();
	}
	public static boolean checkForArmstrongNumber(int number) {
		// Convert Number to String
		String temp = number + "";
		int numLength = temp.length();
		int numCopy = number;
		int sum = 0;
		while(numCopy != 0) {
			int remainder = numCopy%10;
			// using Math.pow to get digit raised to the power
			// total number of digits
			sum = sum + (int)Math.pow(remainder, numLength);
			numCopy = numCopy/10;
		}
		System.out.println("sum is :" +sum);
		return (sum == number) ? true : false;
	}
}