class BubbleSort
{
	public static void main(String...args){
		int []a = {36,19,29,12,5};
		int temp = 0;
		for(int i=0; i<a.length; i++){
			int flag=0;
			for(int j=0; j<a.length-1-i; j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
}
/* 36 19 29 12 5
 round 1
 ----------
-> 36 19 29 12 5
-> 19 36 29 12 5
-> 19 29 36 12 5
-> 19 29 12 36 5
-> 19 29 12 5 36
 round 2
---------- 
-> 19 29 12 5 36
-> 19 29 12 5 36
-> 19 12 29 5 36
-> 19 12 5 29 36
 round 3
 ---------
-> 19 12 5 29 36
-> 12 19 5 29 36
-> 12 5 19 29 36
 round 4
 --------
-> 12 5 19 29 36
-> 5 12 19 29 36   O/P 
*/  