import java.util.*;
class PalindromicPattern
{
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			for(int j=2; j<=i; j++) {
				System.out.print(j);
			}
		System.out.println();	
		}
	}
}
/* O/P
 row = 5
   212
  32123
 4321234
543212345
*/