class TowerOfHanoi
{
	public static void tOHanoi(int n, String src, String help, String dest){
		if(n==1){
			System.out.println("transfer disk"+n+" from "+src+" to "+dest);
			return;
		}
		tOHanoi(n-1,src,dest,help);
		System.out.println("transfer disk"+n+" from "+src+" to "+dest);
		tOHanoi(n-1, help, src, dest);
	}
	public static void main(String...args) {
		int n = 3;
		tOHanoi(n, "S", "H", "D");
	}
}
/* O/P
transfer disk1 from S to D
transfer disk2 from S to H
transfer disk1 from D to H
transfer disk3 from S to D
transfer disk1 from H to S
transfer disk2 from H to D
transfer disk1 from S to D
*/ 