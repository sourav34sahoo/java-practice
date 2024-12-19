import java.util.*;
class NumberPyramid
{
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
/* O/P
row = 5
 1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
*/