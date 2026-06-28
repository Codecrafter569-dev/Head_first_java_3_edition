public class LeftRotateByOne{
	public static void main(String args[]){
		int[] arr = {7,9,3,5,2};
		System.out.print("Created array is Now :");
		printArray(arr);
		System.out.print("After Left Rotation is Performe By 1: ");
		leftRotate(arr);
		
	}
	public static void leftRotate(int[] arr){
		int n = arr.length;
		if(n < 1){
			System.out.println("your array hava a only 1 Element So this is not posible");
			return;
		}
		int first = arr[0];
		for(int i = 1;i< arr.length;i++){
			//arr[i-1] in -1 is repesent Left Rotate By One if in arr[i-2] that means Left Rotate By Two.
			arr[i-1] = arr[i];
		}
		//shift by first Element to last
		arr[n-1] = first;
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
int arr = {7,9,3,5,2};
int n <= arr.length = 5;
if( 5 < 1) - NO ->
int first <= arr[0] = 7;
 
 Shifet By One position Left
 1 Shifet : i = 1 : arr[i-1] = 7 <= arr[i] = 9; -> 9,9,3,5,2
 2 Shifet : i=2 : arr[i-1]  = 9 <= arr[i] = 3; -> 9,3,3,5,2
 3 Shifet : i= 3 : arr[i-1] =3 <= arr[i] = 5 ; - > 9,3,5,5,2
 4 Shifet : i = 4 : arr[i-1] = 5 <= arr[i] = 2; -> 9,3,5,2,2
 
 Now loop is termenated !!!
 arr[n-1] = 2 <= first = 7; -> 9,3,5,2,7
 
 Time Complexity: O(n)
One pass to shift (n–1 steps) plus constant work.

Space Complexity: O(1)
Only uses one extra variable (first).


*/