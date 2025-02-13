interface A 
{
	public void eat();
	public void noise();
}
class Practice1 implements A {
	public void eat() {
		System.out.println("eating");
	}
	public void noise() {
		System.out.println("bow, bow..");
	}
	public static void main(String...args) {
		Practice1 p = new Practice1();
		p.eat();
		p.noise();
	}
}
