class ForEachLoop2
{
	public static void main(String...args)
	{
		int[][] a={{10,20,30,40},{50,60}};
		for (int[] x:a)
		{
			for(int y:x)
			{
				System.out.println(y);
			}
		}
	}
}