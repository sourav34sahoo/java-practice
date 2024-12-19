import java.util.*;
class ButterflyPattern
{
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++){
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			int spaces = 2*(row-i);
			for(int j=1; j<=spaces; j++){
				System.out.print(" ");
			}
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=row; i>=1; i--){
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			int spaces = 2*(row-i);
			for(int j=1; j<=spaces; j++){
				System.out.print(" ");
			}
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/* O/P
row = 10

*                  *
**                **
***              ***
****            ****
*****          *****
******        ******
*******      *******
********    ********
*********  *********
********************
********************
*********  *********
********    ********
*******      *******
******        ******
*****          *****
****            ****
***              ***
**                **
*  
                *
*/