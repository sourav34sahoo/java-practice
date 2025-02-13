import java .util.*;
class StudentSolution
{
	public static void main(String... args)
	{
		//Scanner sc = new Scanner(System.in);
		int no = 10;
		String bin = "";
		
		while (no != 0);
		{
			bin = (no & 1) + bin;
			no = no >> 1;
		}
		bin = bin.replaceAll ("1","2");
	    bin = bin.replaceAll ("0","2");
		bin = bin.replaceAll ("2","0");
		
		int res = Integer.parseInt(bin,2);
		System.out.println(res);
	}
}



