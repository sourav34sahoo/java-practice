class Sample
{
	Sample(String s) {
		System.out.println("Sample class Constructor Execution with arguments"+s);
	}
}
interface Interf
{
	public Sample get(String s);
}
public class ConstructorReferencePassingArguments
{
	public static void main(String...args) {
		Interf i =Sample::new;
		Sample s1 = i.get("sourav");   // Sample class Constructor Execution with arguments sourav
		Sample s2 = i.get("sahoo");    // Sample class Constructor Execution with arguments sahoo
	}
}