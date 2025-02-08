class Sample
{
	Sample() {
		System.out.println("Sample class Constructor Execution");
	}
}
interface Interf
{
	public Sample get();
}
public class ConstructorReference
{
	public static void main(String...args) {
		Interf i =Sample::new;
		Sample s1 = i.get();   // Sample class Constructor Execution
		Sample s2 = i.get();    // Sample class Constructor Execution
	}
}