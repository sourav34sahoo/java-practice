import java.util.*;
class FactorialNo
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eter a Number");
		int fno = sc.nextInt();
		
		int z=1;
		for (int i=1;i<=fno;i++)
		{
			z=z*i;
		}
		System.out.println(fno+"! = "+z);
	}
}