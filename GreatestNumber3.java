import java.util.*;
class GreatestNumber3
 {
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the 1st number-");
   int a = sc.nextInt();
   
   System.out.println("Enter the 2nd number-");
   int b = sc.nextInt();
   
   System.out.println("Enter the 3rd number-");
   int c = sc.nextInt();
   
   if (a > b && a > c){
   System.out.println("a is the greatest number");
   }
   else if ( b > c){
   System.out.println("b is the greatest number");
   }
   else{
   System.out.println("c is the greatest number");
   }
  }
 }

   