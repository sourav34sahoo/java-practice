import java.util.*;
class Grade
{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name-");
		String name = scanner.next();
		
		System.out.println("Enter mark-");
		int mark = scanner.nextInt();
		
		if (mark >= 90 && mark <= 100 ){
			System.out.println(name +" Secured O grade as he is having "+mark+ " mark");
		}
		else if (mark>= 80 && mark < 90 ){
			System.out.println(name +" Secured E grade as he is having "+mark+ " mark");
		}
		else if (mark >= 70 && mark < 80){
			System.out.println(name +" Secured A grade as he is having "+mark+ " mark");
		}
		else if (mark >= 60 && mark < 70 ){
			System.out.println(name +" Secured B grade as he is having "+mark+ " mark");
		}
		else if (mark >= 50 && mark < 60 ){
			System.out.println(name +" Secured C grade as he is having "+mark+ " mark");
		}
		else if (mark >= 40 && mark < 50 ){
			System.out.println(name +" Secured D grade as he is having "+mark+ " mark");
		}
		else if (mark >= 0 && mark < 40 ){
			System.out.println(name +" Secured F grade as he is having "+mark+ " mark");
		}
		else{
			System.out.println ("the given mark is wrong allowed mark is 0-100");
		}
	}
}

 	