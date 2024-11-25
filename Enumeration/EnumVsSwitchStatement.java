enum Beer
{
	Kf,Ko,Rc,Fo
}
class EnumVsSwitchStatement
{
	public static void main(String...args)
	{
		Beer b = Beer.Kf; 
		switch(b)
		{
			case Kf:
					System.out.println("It is children's brand");
					break;
			case Ko:
					System.out.println("It is too lite");
					break;
			case Rc:
					System.out.println("It is challengers Brand");
					break;
			case Fo:
					System.out.println("Buy one get one");
					break;
			default:
					System.out.println("Other brand are not allowed");
		}
	}
	
}