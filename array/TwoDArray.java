import java.util.*;
class TwoDArray
{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size");
		int rows = sc.nextInt();
		System.out.println("Enter the coloum size");
		int cols = sc.nextInt();
		int[][] numbers = new int[rows][cols];
		
		System.out.println("Enter the row,column values ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(numbers[i][j] +" ");
			}
			System.out.println();
		}
	}
} 