interface VariableNameingConflictsLeft
{
	int x = 10;
}
interface VariableNameingConflictsRight
{
	int x = 100;
}
class Test implements VariableNameingConflictsLeft,VariableNameingConflictsRight
{
	public static void main(String...args){
		//System.out.println(x);   C.E refernce to x is abiguous
		System.out.println(VariableNameingConflictsLeft.x);
		System.out.println(VariableNameingConflictsRight.x);
	}
} 
/* These may be a chance of 2 interface contains available with same name & may rise variable
naming conflicts but we can resolve these naming conflicts by using Interface names. */ 