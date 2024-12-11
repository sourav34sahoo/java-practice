import java.util.Date;
class RuntimeDemo
{
	public static void main(String...args) {
		Runtime r = Runtime.getRuntime();
		System.out.println(r.totalMemory());    // 132120576
		System.out.println(r.freeMemory());    // 130105040
		
		for(int i=1; i<=10000; i++) {
			Date d = new Date();
			d=null;
		}
		System.out.println(r.freeMemory());    // 130105040
		r.gc();
		System.out.println(r.freeMemory());    // 7871472
	}
}