import java.util.Arrays;
public class K_Th_SmallestElementsInArrays{
	public static void main(String args[]){
		int[] arr = {3,5,2,1,8,9,4,6};
		int k = 4;
		System.out.println("Array : "+Arrays.toString(arr));
		Integer kthSmallest = k_thSmallest(arr,k);
		if(kthSmallest != null){
			System.out.println(k+"-th Smallest Element is :"+kthSmallest);
		}else{
			System.out.println("you "+k+" is so Smallest :");
		}
		
		
	}
	public static Integer k_thSmallest(int[] arr,int k){
		int n = arr.length;
		if(k < 1 || k> n){
			return null;
		}
		Arrays.sort(arr);
		System.out.print("Sorted array is ");
		System.out.println("Array : "+Arrays.toString(arr));

		return arr[k-1];
	}
}
/*
int[] arr  = {4,7,9,1,2};
int k = 3;
int n <= arr.length = 5;

if(k = 3 < 1 || k = 3 > n =5) no -> OK
the Sorted array
arr = [1,2,4,7,9};

return arr[k = 3 - 1] = arr[2];
result is : 4;
 
4. Complexity Analysis

Time Complexity: O(n log n) due to sorting (where n = number of elements).

Space Complexity:

O(1) extra if sort is in-place, or O(n) if the sorting algorithm needs auxiliary space.



*/