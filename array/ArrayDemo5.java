// search the given number x and print the index which it occures in Array

import java.util.*;
class ArrayDemo5
{
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sizeof an Array");
		int size = sc.nextInt();
		
		System.out.println("Enter the array input value");
		int[] numbers = new int[size]; 
		
		for(int i=0; i<size; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println("Enter the search number");
		int x = sc.nextInt();
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == x){
				System.out.println("x found at index no is: "+i);
			}
		}
	}
}
