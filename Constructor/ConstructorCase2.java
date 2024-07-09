class p
{
}
class c extends p
{
}
here default constructor will ganerated both parent class and child class so we will not get compile time error.
class p 
{
	p()
	{
	}
}
class c extends p
{
}
here in the child class ganerat default constructor bcz there in parent class is a no argument constructor is there thats why we have not get any compile time error.
class p
{
	P(int i)
	{
	}
}
class c extends p
{
}
 here we will get compile time error bcz parent class constructor contain argument but in child class has not any constructor so by default child class constructor take the default constructor and the child class contain no-args constructor and parent class contain argument constructor so that's why we will get compile time error.
 
