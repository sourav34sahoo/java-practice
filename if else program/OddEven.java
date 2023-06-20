import java.util.*;
class OddEven
{
  public static void main(String[]args)
  {
  Scanner sc= new Scanner(System.in);   
  System.out.print("Enter the number- ");  
  int a= sc.nextInt();
  if (a % 2 ==0){
  System.out.println("the given numbers are even");
  }
  else{
  System.out.println("the given numbers are odd");
  }
  }
}
