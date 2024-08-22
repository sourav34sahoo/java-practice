abstract class AbstractModifierDemoVechicle
{
	public abstract int getNoOfWheels();
}
class Bus extends AbstractModifierDemoVechicle
{
	public int getNoOfWheels()
	{
		return 6;
	}
}
class Auto extends AbstractModifierDemoVechicle
{
	public int getNoOfWheels()
	{
		return 3;
	}
}

// By declaring abstarct methods in parent class we can define Guidelines to the child classes which describes the methods those are to be compulsory implemanted by child class. 

// abstract modifier never talks about implementation, if any modifier talks about implementation then it is always illegal combination with abstract.

// abstract *** ( final, static , Synchronized, native, Strictfp, private)
