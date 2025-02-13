import java.util.*;
class Triangle
{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first angel-");
	    int angelA = sc.nextInt();
	
	    System.out.println("Enter second angel-");
	    int angelB = sc.nextInt();
	
	    System.out.println("Enter third angel-");
	    int angelC = sc.nextInt();
	
	    if (angelA == angelB && angelA == angelC){
			System.out.println(angelA +" , "+ angelB +" , "+ angelC + " The triangle is Equilateral");
		}
		else{
		System.out.println(angelA +" , "+ angelB +" , " +angelC + " The triangle is not Equilateral");
		}
	}
}

 