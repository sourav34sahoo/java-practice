class Test
{
	private static Test test;
	private Test()
	{
	}
	public static Test getTest() {
		if(test==null){
			test = new Test();
		}
		return test;
	}
}
class SingletonDP
{
	public static void main(String...args) {
		Test t1 = Test.getTest();
		Test t2 = Test.getTest();
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
	}
}
// O/P
681842940
681842940