package pack2;
import pack1.ParentClass;
class ParentC extends ParentClass
{
	public static void main(String...args)
	{
		//ParentClass a = new ParentClass();
		//a.m1();
		ParentC c = new ParentC();
		c.m1();
		//ParentClass a1 = new ParentC();
		//a1.m1();
	}
}

//within the current package we ca access protected members either by parent reference or by child reference.

//But from outside package we can access protected members only by using child reference, if we are trying to use parent reference we will get C.E .

// private < default < protected < public