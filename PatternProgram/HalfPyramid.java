import java.util.*;
class HalfPyramid
{
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in );
		System.out.println("Enter row");
		int row = sc.nextInt();
		System.out.println("Enter column");
		int column = sc.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/* O/P
row =5
column = 5
*
**
***
****
*****
*/