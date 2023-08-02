class FallThrough
{
	public static void main(String... args){
		int x = 0;
		switch(x)
		{
			case 0:
			     System.out.println("0");
			case 1:
			     System.out.println("1");
			     break;
			case 3:
			     System.out.println("3");
			default:
			     System.out.println("def");
		}
	}
}
