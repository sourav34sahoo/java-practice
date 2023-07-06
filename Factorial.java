import java.util.*;
class Factorial
{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int x = sc.nextInt();
		
		int z = 1;
		
		for(int i = 1; i <= x ; i++){
			z = z * i;
			System.out.println(x +"! =" + z);
		}
	}
}
