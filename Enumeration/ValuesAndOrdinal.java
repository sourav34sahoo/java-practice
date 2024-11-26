enum Beer
{
	kf,ko,rc,fo
}
class ValuesAndOrdinal
{
	public static void main(String...args) 
	{
		Beer[] b = Beer.values();
		for(Beer b1:b){
			System.out.println(b1+"---"+b1.ordinal());
		}
	}
}