class GenericClass1
{
	add(Object o);
	Object get(int index)
}
// Untill 1.4 a non-generic version of arraylist declare as follows.
/*The argument to the add() method is object,hence we can add any type of object
due to this we are not getting Type-safety.
->The return type of get() method is object,hence at the time of retrival compulsary
 we should perform Type-casting */