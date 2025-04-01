// print numbers from 1 to 5
class RecursionDemo2
{
	public static void printNum(int n){
		if(n == 6){
			return;
		}
		System.out.print(n+" ");
		printNum(n+1);
	}
	public static void main(String...args) {
		int n = 1;
		printNum(n);
	}
} 
/* O/P
1 2 3 4 5 */