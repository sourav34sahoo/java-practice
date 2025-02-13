import java.util.*;
class practice
{
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int temp = row;
		int count = row;
		for(int i=row; i>=1; i--) {

			for(int j=1; j<=count-i; j++){
				System.out.print(" ");
			}
			for(int j=row; j>=1; j--){
				System.out.print(j);
				temp--;
			}
			row--;
			
			System.out.println();
		}
	}
}