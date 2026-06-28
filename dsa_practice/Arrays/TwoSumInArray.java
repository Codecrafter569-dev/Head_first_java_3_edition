import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class TwoSumInArray{
	public static void main(String args[]){
		int[] arr = {4,5,6,7,9};
		int k = 16;
		System.out.println("Created Arrays : "+Arrays.toString(arr));
		int[] result = twoSum(arr,k);
		if(result != null ){
			System.out.println("Incedic "+result[0] +" "+result[1]);
			System.out.println("Velide "+arr[result[0]]+" "+arr[result[1]]);
		}else{
			System.out.println("No sum are ableveb ");
		}
		
	}
	public static int[] twoSum(int[] arr,int k){
	Map<Integer,Integer> freqMap = new HashMap<>();
		for(int i = 0;i < arr.length;i++){
			int x = arr[i];
			int complement = k-x;
			if(freqMap.containsKey(complement)){
				return new int[] {freqMap.get(complement),i};
			}
			freqMap.put(x,i);
		}
		return null;
	}
	
}
/*
int[] arr ={4,5,6,7,9};
int k = 10;
Map ={};
i  = 0 : x = arr[i] = 4 :
c = 10 - 4 = 6;
if c  = 6 is containsKey in the Map . you return but No
Update :
Map {x = 4 :i = 0};

i=1 : x = arr[i] = 5 :
c= 10 -5 =5 :
if c = 5 is containsKey in the Map. you return but No ->
Update :
Map {x = 4 : i = 0,x = 5 : 1};

i = 2 : x = arr[i] = 6 :
c = 10 - 6 = 4 :
if c = 4 is containsKey in the Map. you return Yes ->
 int[0,2] = 4,6
 now return 0,2 that means output = 4,6

	. Complexity Analysis

Time Complexity: O(n), where n = number of elements.
We do a single pass and each map lookup/insertion is O(1) on average.

Space Complexity: O(n).
In the worst case (no match until the end), the map holds up to n entries.


*/