import java.util.*;
class PrintIndexNoOfAGivenValue
{
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size");
		int rows = sc.nextInt();
		System.out.println("Enter the column size");
		int cols = sc.nextInt();
		
		int[][] numbers = new int[rows][cols];
		
		System.out.println("Enter index values");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the searching value");
		int x = sc.nextInt();
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(numbers[i][j] == x) {
					System.out.print("index no is: " +i+" , "+j );
				}
			}
			System.out.println();
		} 		
	}
}