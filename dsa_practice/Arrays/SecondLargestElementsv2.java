
public class SecondLargestElementsv2{
	public static void main(String args[]){
		int[] arr = {3,6,9,4,5,7};
		printArrays(arr);
		Integer secondMax = findSecondLargestElements(arr);
		if(secondMax != null){
			System.out.println("secondMax Elements in array : "+secondMax);
		}else{
			System.out.println("no secondMax Element in array : ");
		}
	}
	public static void printArrays(int[] arr){
		for(int x : arr){
			System.out.print(x+" ");
		}
		System.out.println();
		
	}
	public static Integer findSecondLargestElements(int[] arr){
		if(arr.length < 2){
			return null;
		}
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int x : arr){
			if( x > max){
				secondMax = max;
				max = x;
			}else if( x > secondMax && x != max){
				secondMax = x;
			}
		}
		return (secondMax == Integer.MIN_VALUE) ? null : secondMax;
		
	}
}
/*
Spposed this is a arr
int[] arr = {3,6,9,4,5,7};

1.
x = 3;
if( x = 3 > max = MIN_VALUE) yes ->
secondMax <= max = MIN_VALUE; 
max <= x =6;

2.
x = 6;
if(x = 6 > max = 3) yes ->
secondMax  <= max = 3;
max <= x = 6;

3.
x = 9;
if( x = 9 > max = 6) yes ->
secondMax <= max = 6;
max <= x = 9;

4. 
x = 4
if(x = 4 > max = 9)No ->
else if(x = 4 > secondMax = 6 && x = 4 != max) No - >

5.
x = 5
if(x = 5 > max = 9)No ->
else if(x = 5 > secondMax = 6 && x = 5 != max) No - >

6.
x = 7
if(x = 7 > max = 9)No ->
else if(x = 7 > secondMax = 6 && x = 7 != max) yes ->
secondMax <= x = 7;

if(secondMax == Integer.MIN_VALUE) No ->
Else
	return secondMax;

result is = 6;



4. Complexity Analysis

Time Complexity: O(n), where n = number of elements (one pass).

Space Complexity: O(1), only two extra variables (max, secondMax).
*/