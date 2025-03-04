class BinarySearch
{
	public static void main(String...args) {
		int []a = {2,3,7,9,27,37,48,56,78};
		int srch = 50;
		int li = 0;
		int hi = a.length-1;
		int mi = (li+hi)/2;

		while(li<=hi){
			if(a[mi]==srch){
				System.out.println("Element find at index "+mi);
				break;
			}
			else if(a[mi]<srch){
				li = mi+1;
			} else
			{
				hi = mi-1;
			}
			mi = (li+hi)/2;
		}
		if(li>hi){
			System.out.println("Element not found");
		}
	}
}