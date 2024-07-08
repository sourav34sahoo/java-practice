class DefaultConstructor
1-> programers code
class Test
{
}
//compiler ganerated code
class Test
{
	Test()
	{
		super();
	}
}
2-> programers code
public class Test
{
}
//Compiler ganerated code
public class Test
{
	public Test()
	{
		super();
	}
} 
3-> programers code
class Test
{
	Test();
	{
	}
}
//Compiler ganerated code
class Test
{
	Test()
	{
		super();
	}
}
4-> programers code
class Test
{
	void Test()
	{
	}
}
//Compiler ganerated code
class Test
{
	Test()
	{
		super();
	}
	void Test()
	{
	}
}
5-> programers code
class Test
{
	Test()
	{
		This(10);
	}
	Test(int i)
	{
	}
}
//Compiler ganerated code
class Test
{
	Test()
	{
		This(10);
	}
	Test (int i)
	{
		super();
	}
}
6-> programers code
class Test
{
	Test(int i)
	{
		super();
	}
} 
//Compiler ganerated code
class Test
{
	Test (int i)
	{
		super();
	}
}
