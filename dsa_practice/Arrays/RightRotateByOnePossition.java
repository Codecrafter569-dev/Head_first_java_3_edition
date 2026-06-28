public class RightRotateByOnePossition{
	public static void main(String args[]){
		int[] arr = {4,5,6,7,8};
		System.out.print("Created a Array :");
		printArray(arr);
		System.out.print("After Rigth rotation by one position : ");
		rightRotate(arr);
	}
	public static void rightRotate(int[] arr){
		int n = arr.length;
		if(n < 1){
			return;
		}
		int last = arr[n-1];
		
		for(int i = n-2 ; i >= 0;i--){
			
			arr[i+1] = arr[i];
		}
		arr[0] = last;
		printArray(arr);
	}
	public static void printArray(int[] arr){
		for(int n : arr){
			System.out.print(n+" ");
		}
		System.out.println();
		
	}
}
/*
int[] arr = {4,5,6,7,8};
int n = arr.length = 5;
if(n = 5 < 1 ) -> NO
int last <= arr[n-1] = 50;
 i = 3 : arr[i+1] = 8 <= arr[i] = 7 : 4,5,6,7,7
 i = 2 : arr[i+1] = 7 <= arr[i] = 6 : 4,5,6,6,7
 i = 1 : arr[i+1] = 6 <= arr[i] = 5 : 4,5,5,6,7
 i = 0 : arr[i+1] = 5 <= arr[i] = 4 : 4,4,5,6,7
 
finaly loop terminated
 arr[0] = 4 <= last = 8 : 8,4,5,6,7
 final Ouput : 8,4,5,6,7


4. Complexity Analysis

Time Complexity: O(n)
One pass to shift (n–1 steps) plus constant work.

Space Complexity: O(1)
Only uses one extra variable (last).
*/