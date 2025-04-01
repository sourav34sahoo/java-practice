// print sum of first n natural numbers
class RecursionDemo3
{
	public static void printSum(int a,int n,int sum){
		if(a == n){
			sum += a;
			System.out.println(sum);
			return;
		}
		sum += a;
		printSum(a+1,n,sum);
		System.out.println(a);
	}
	public static void main(String...args){
		printSum(1,10,0);
	}
}