enum Beer
{
	kf(70),ko(80),rs(90),bv;
	int price;
	Beer(int price)
	{
		this.price=price;
	}
	Beer(){
		this.price = 65;
	}
	public int getprice() {
		return price;
	}
}
class Test3 
{
	public static void main(String...args) {
		Beer[] b = Beer.values();
		for(Beer b1:b) {
			System.out.println(b1+"---"+b1.getprice());
		}
	}
}
/* o/p
kf---70
ko---80
rs---90
bv---65
kf => public static final Beer kf = new Beer();
kf(70) => public static final Beer kf = new Beer(70);