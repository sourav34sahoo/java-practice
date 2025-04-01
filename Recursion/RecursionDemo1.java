// print numbers from 5 to 1
class RecursionDemo1
{
	public static void printNum(int n){
		if(n==0){
			return;
		}
		System.out.print(n+" ");
		printNum(n-1);
	}
	public static void main(String...args) {
		int n = 5;
		printNum(n);  // n=5
	}
}
/* O/P
5 4 3 2 1 */