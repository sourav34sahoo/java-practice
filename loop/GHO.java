 import java.util.*;
 class GHO
 {
	 public static void main(String...args){
		  int x,y,z;
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter two number x and y");
		  int x = sc.nextInt();
		  int yn = sc.nextInt();
		  System.out.println("before swapping the two numbers are"+ x +" " +y);
		 
		  z = x;
		  z = y;
		  x = y;
		  
		  System.out.println("After swapping the two numbers are"+ x +" " +y);
		  System.out.println();
	 }
 }
 