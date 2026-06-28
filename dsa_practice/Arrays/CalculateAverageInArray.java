import java.util.Scanner;
import java.lang.Math;
public class CalculateAverageInArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a length of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)((Math.random())*99);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Average of a Array is : "+average(arr));
	}
	public static double average(int[] arr){
		double sum = 0;
		for(int i=0;i < arr.length;i++){
			sum += arr[i];
			
		}
		return  sum = sum/arr.length;
		
		
	}
}