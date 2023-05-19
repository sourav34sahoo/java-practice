class Array
{
  public static void main(String[]args)
  {
    int[] x=new int[3];
	System.out.println(x.getClass().getName());
	
	int[][] x1=new int[2][3];
	System.out.println(x1.getClass().getName());
	
	double[] x2=new double[3];
	System.out.println(x2.getClass().getName());
	
	short[] x3=new short[5];
	System.out.println(x3.getClass().getName());
	
	byte[] x4=new byte[5];
	System.out.println(x4.getClass().getName());
	
	int[] x5=new int[0];
	System.out.println(x5.getClass().getName());
	
	int[] x6=new int[214748364];
	System.out.println(x6.getClass().getName());
	
	boolean[] x7=new boolean[2];
	System.out.println(x7.getClass().getName());
  }
}  