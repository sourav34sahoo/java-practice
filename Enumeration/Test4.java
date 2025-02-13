enum color 
{
	blue,red,green;
	public void info() {
	System.out.println("Universal color");
	}
}

class Test4 {
	public static void main(String...args) {
		color[] c = color.values();
		for(color c1:c) {
			c1.info();
		}
	}
}
/* o/p
Universal color
Universal color
Universal color
*/