class ArrayInitialization
{
  public static void main(String[]args)
  {
  int[] x=new int[2];
  System.out.println(x);
  System.out.println(x[0]);
  
  int[][] x1=new int[2][3];
  System.out.println(x1);
  System.out.println(x1[0]);
  System.out.println(x1[0][0]);
  
  int[][] x2=new int[2][];
  System.out.println(x2);
  System.out.println(x2[0]);
  System.out.println(x2[0][0]);
  }
}
