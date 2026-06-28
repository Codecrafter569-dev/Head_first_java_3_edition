public class MinElementInArrayV2{
	public static void main(String args[]){
		int arr[]  ={3,4,7,4,9,1,6};
		printArray(arr);
	System.out.println("Minimum Value is in Array "+getMin(arr));

	}
	public static int getMin(int[] arr){
		int min = arr[0];
		for(int i = 1;i < arr.length;i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
	public static void printArray(int[] arr){
		for(int n : arr){
			System.out.print(n+ " ");
		}
		System.out.println();
		
	}
}
/*
sepe 1 : assine in iteration 0
min <= arr[0] = 3;
i = 1 arr[1] = 4:
if 4 > 3 No ->min say 3;
i = 2 arr[2] = 7:
if 7 > 3 N0 ->min say 3;
i = 3 arr[3] = 4:
if 4 > 3 No -> min say 3;
i = 4 arr[4] = 9:
if 9 > 3 No -> min say 3;
i = 5 arr[5] = 1:
if 1 < 3 Yes -> min say 1;
i = 6 arr[6] -> 6:
if 6 > 1 No - > min say 1;

End loop = min 1;

4. Complexity Analysis

Time Complexity: O(n), where n = number of elements.
One comparison per element.

Space Complexity: O(1).
Only one extra variable (min) is used.


*/