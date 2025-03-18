class Testtt
{
	private static Testtt test1;
	private static Testtt test2;
	private Testtt()
	{
	}
	public static Testtt getTest(){
		if(test1==null){
			test1 = new Testtt();
			return test1;
		}
		else if(test2==null){
			test2 = new Testtt();
			return test2;
		}
		else {
			if(Math.random() < 0.5)
				return test1;
			else
				return test2;
		}
	}
}
class DoubletonDP
{
	public static void main(String...args){
		Testtt t1 = Testtt.getTest();
		System.out.println(t1.hashCode());
		
		Testtt t2 = Testtt.getTest();
		System.out.println(t2.hashCode());
		
		Testtt t3 = Testtt.getTest();
		System.out.println(t3.hashCode());
		
		Testtt t4 = Testtt.getTest();
		System.out.println(t4.hashCode());
	}
}

// O/P
681842940
1392838282
681842940
1392838282