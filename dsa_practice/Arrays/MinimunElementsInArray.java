import java.util.Scanner;
import java.lang.Math;
public class MinimunElementsInArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Eenter a length of array :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < arr.length;i++){
			arr[i] = (int)((Math.random())*99);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Minimun Element In The Array is : "+minimunElements(arr));
	}
	public static int minimunElements(int[] arr){
		int min = arr[0];
		for(int i = 0;i < arr.length;i++){
			if(min <= arr[i]){
				min = min;
			}else{
				min = arr[i];
			}
		}
		return min;
		
	}
}