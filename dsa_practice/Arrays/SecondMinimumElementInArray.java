import java.util.Scanner;
import java.lang.Math;
public class SecondMinimumElementInArray{
	public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
		System.out.print("Enter a length of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ;i < arr.length;i++){
			arr[i] = (int)((Math.random())*100);
		}
		System.out.println("Second Minimum Element In Array : "+secondMinimun(arr));
	}
	public static int secondMinimun(int[] arr){
		int min = arr[0];
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
			if(min <=arr[i]){
				min = min;
			}else{
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("Minimum Element in Array : "+min);
		int min1 = arr[0];
		for(int i = 0;i < arr.length;i++){
			if(min1 >=arr[i]){
				if(min != arr[i]){
					min1 = arr[i];
				}
			}
				
			
		}
		
		return min1;
	}
}