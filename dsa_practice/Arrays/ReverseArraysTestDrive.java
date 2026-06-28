import java.util.Scanner;
import java.lang.Math;
public class ReverseArraysTestDrive{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a length of arr : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int arr1[] = new int[n];
		for(int i =0;i < n;i++){
			arr[i] =(int)(Math.random()*10) ;
		}
		for(int i = 0;i < n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int  r = n;
		for(int i = 0;i < n;i++){ 		
                r--;			  
			arr1[i] = arr[r];
			System.out.print(arr1[i]+" ");
			
		}
		System.out.println();
	}
	/*
	i = 0 ; 4 = 5 - 1;
	i = 1;  3 = 4 -1;
	i = 2;  2 = 3 - 1;
	i = 3;  1 = 2 - 1;
	i = 4;  0 = 1 - 1;
	
	
	*/
}