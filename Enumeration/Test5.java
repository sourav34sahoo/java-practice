enum color
{
	blue,red
	{
		public void info(){
			System.out.println("Universal color");
		}
	},green;
	public void info() {
		System.out.println("Dangerious color");
	}
}
class Test5
{
	public static void main(String...args) {
		color[] c = color.values();
		for(color c1:c) {
			c1.info();
		}
	}
}