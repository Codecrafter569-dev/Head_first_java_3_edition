import java.util.Scanner;
import java.lang.Math;
public class CalculateSumOfArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a length of arrays : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < arr.length;i++){
			arr[i] = (int)((Math.random())*99);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Sum of all Elements in the Array : "+calucalteSum(arr));
	}
	public static double calucalteSum(int[] arr){
		double sum = 0;
		for(int i = 0; i< arr.length;i++){
			sum += arr[i];
		}
		return sum;
		
	}
}
/*
3. Step-by-Step Walkthrough

Given arr = [3, 7, 2, 9, 5]:

1. Initialize

sum = 0.



2. i = 0 (arr[0] = 3)

sum = sum + 3 = 0 + 3 = 3.



3. i = 1 (arr[1] = 7)

sum = 3 + 7 = 10.



4. i = 2 (arr[2] = 2)

sum = 10 + 2 = 12.



5. i = 3 (arr[3] = 9)

sum = 12 + 9 = 21.



6. i = 4 (arr[4] = 5)

sum = 21 + 5 = 26.



7. End of loop

Return sum = 26.





---

4. Complexity Analysis

Time Complexity: O(n), where n = number of elements.
One addition per element.

Space Complexity: O(1).
Only one extra variable (sum) is used.



---



*/