
public class ReversArrayV2{
	public static void main(String args[]){
		int[] arr = {1,2,3,4,5,6,7,8};
		printArray(arr);
		printReverse(arr);
	}
	public static void printReverse(int[] arr){
		int left = 0;
		int right = arr.length-1;

		while(left < right){

			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

		printArray(arr);
	}
	public static void printArray(int[] arr){
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
/*
while 1 : left = 0 < right = 7
temp <= 1 = arr[left];
arr[left] = 1 in assine <= arr[right] = 8;
arr[right] = 8 in assine <= temp = 1; 1,8 =>8,1;
left++ = 0++ = 1;
right-- = 7-- = 6;

while 2 : left = 1 < right = 6;
temp <= 2 = arr[left];
arr[left] = 2 in assine <= 7 = arr[right];
arr[right] = temp = 2;2,7 => 7,2;
left++ = 1++ = 2;
right-- = 6-- = 5;

while 3 : left = 2 < right = 5;
temp <= 3 = arr[left];
arr[left] = 3 in assine <= arr[right] = 6;
arr[right] = 6 in assine <= temp = 3; 3,6 => 6,3;
left++ = 2++ = 3;
right-- = 5-- = 4;

while 4 : left = 3 < right = 4;
temp <= 4 = arr[left];
arr[left] = 4 in assine <= arr[right] = 5;
arr[right] = 5 in assine <= temp = 4; 4,5 => 5,4;
left++ = 3++ = 4;
right-- = 4-- = 3;

now loop is terminated!! because = left > right = 4 > 3 !
finaly is answer is = 8,7,6,5,4,3,2,1

Complexity Analysis

Time Complexity: O(n), where n = array length.
You make one swap per loop iteration, and there are about n/2 iterations.

Space Complexity: O(1).
You only use a constant number of extra variables (left, right, temp).
*/