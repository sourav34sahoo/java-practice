class Test1<T extends Number>
{
	public static void main(String...args)
	{
		Test1<Integer> t1 = new Test1<Integer>();
		//Test1<String> t2 = new Test1<String>();  C.E type argument String is not within bounds of type-variable T
	}
}
//We can bound the type parameter for a particular range by using extends keyword.
//As the type parameter we can pass either Number type or its child classes. it is bounded type. 