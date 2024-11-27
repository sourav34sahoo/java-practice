enum Beer
{
	kf,ko,rc;
	Beer(){
		System.out.println("Constructor");
	}
}
class Test2
{
	public static void main(String...args) {
		Beer b = Beer.kf;
		System.out.println("Hello");
	}
}
/* O/p
Constructor
Constructor
Constructor
Hello
An enum can contain constructor
enum constructor will be executed separately for every enum constant
at the time of enum class loading automatically. 
*/