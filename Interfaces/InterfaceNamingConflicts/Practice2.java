class Practice2 implements A
{
	public void eat() {
		System.out.println("eating");
		
	}
	public void noise() {
		System.out.println("mow mow...");
	}
	public static void main(String...args) {
		Practice2 p2 = new Practice2();
		p2.eat();
		p2.noise();
	}
}