class ObjectCreatedInsideAMethod
{
	public static void main(String...args) {
		m1();
	}
	public static void m1()
	{
		Student s1 = new Student();
		Student s2 = new Student();
	}
}

// 2 objects eligible for G.C