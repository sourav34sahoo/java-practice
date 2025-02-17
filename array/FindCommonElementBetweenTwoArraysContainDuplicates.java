import java.util.*;
class FindCommonElementBetweenTwoArraysContainDuplicates
{
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first array size");
		int size1 = sc.nextInt();
		int []arr1 = new int[size1];
		System.out.println("Enter first array");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter second array size");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("Enter second array");
		for(int j=0; j<arr2.length; j++){
			arr2[j] = sc.nextInt();
		}
		
		
		System.out.println("Common elements between two element are: ");
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j])
					hs.add(arr1[i]);
			}
		}
		for(int no:hs) {
			System.out.println(no+",");
		}
	}
}