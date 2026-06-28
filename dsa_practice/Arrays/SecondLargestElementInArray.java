import java.util.Scanner;
import java.lang.Math;
public class SecondLargestElementInArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a length of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ;i < arr.length;i++){
			arr[i] = (int)((Math.random())*100);
		}
		System.out.println("Second Largest Element In Array : "+secondLarge(arr));
		
	}
	public static int secondLarge(int[] arr){
		int max = 0;
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
			if(max <= arr[i]){
				max = arr[i];
			}
		}
		System.out.println();
		System.out.println("Largest Element in the Arrays :"+max);
		int max1 = 0;
		for(int i = 0;i < arr.length;i++){
			if(max1 < arr[i]){
				if(max != arr[i]){
					max1  = arr[i];
				}
			}
		}
		return max1;
		
	}
}