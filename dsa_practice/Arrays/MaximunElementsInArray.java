import java.util.Scanner;
import java.lang.Math;
public class MaximunElementsInArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array length :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < arr.length;i++){
			arr[i] = (int)((Math.random())*99);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Maximun Elements in the array is : "+maxElements(arr));
		
	}
	public static int maxElements(int[] arr){
		int max = arr[0];
		for(int i = 1;i < arr.length;i++){
			if(max <= arr[i]){
				max = arr[i];
			}
			
		}
		return max;
		
	}
	
}
/*
3. Step-by-Step Walkthrough

Given arr = [3, 7, 2, 9, 5]:

1. Initialize

max = arr[0] = 3.



2. i = 1 (arr[1] = 7)

Is 7 > 3? Yes → max = 7.



3. i = 2 (arr[2] = 2)

Is 2 > 7? No → max stays 7.



4. i = 3 (arr[3] = 9)

Is 9 > 7? Yes → max = 9.



5. i = 4 (arr[4] = 5)

Is 5 > 9? No → max stays 9.



6. End of loop

Return max = 9.





---

4. Complexity Analysis

Time Complexity: O(n), where n = number of elements.
You perform one comparison per element.

Space Complexity: O(1).
You only use one extra variable (max).





*/