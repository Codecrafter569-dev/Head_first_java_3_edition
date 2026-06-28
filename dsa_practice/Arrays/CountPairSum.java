import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class CountPairSum{
	public static void main(String args[]){
		int[] arr = {4,5,6,3,3};
		int k = 6;
		System.out.println("Arrays : "+Arrays.toString(arr));
		System.out.println("Target Sum : "+k);
		System.out.println("Total Pair Sum :"+countNumberOfPairs(arr,k));
		
		
		
	}
	public static int countNumberOfPairs(int[] arr, int k){
		Map<Integer , Integer> freqSum = new HashMap<>();
		int pairSum = 0;
		for(int x : arr){
			int complements = k-x;
			if(freqSum.containsKey(complements)){
				pairSum += freqSum.get(complements);
			}
			freqSum.put(x,freqSum.getOrDefault(x,0)+1);
			
		}
		System.out.println("HashMap With Pair : ");
		for (Map.Entry<Integer, Integer> entry : freqSum.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
		return pairSum;
		
	}
	
}
/*
int[] arr = {4,5,6,3,3};
int k = 6;
Map = {};
pairSum = 0;

x = 4 :
c <= k(6) - x(4) = 2; c = 2;
if c = 2is avalabe in Map No => pairSum = 0 ;(no change);
update :
Map = {4 == 1};

x = 5 :
c <= k(6)-x(5) = 1: c= 1;
if c = 1 is avalabe in Map No => pairSum = 0 ;(no change);
update :
Map = { 4 ==1 , 5 == 1};

x = 6 :
c <= k(6)-x(6) = 0 : c = 0;
if c = 0 is avalabe in Map No => pairSum = 0 ;(no change);
update :
Map = {4 == 1 ,5 == 1, 6== 1};

x = 3 :
c <= k(6)- x(3) = 3 :
if c = 3 is avalabe in Map No => pairSum = 0 ;(no change);
update :
Map = {4 == 1,5 == 1, 6 == 1, 3 == 1};
 
 x = 3 :
 c <= k(6)- x(3) = 3 :
if c = 3 is avalabe in Map Yes => pairSum = 1 ;
update :
Map = {4 == 1,5 == 1, 6 == 1, 3 == 2};

final answer is : 1;


4. Complexity Analysis

Time Complexity: O(n), where n = number of elements.
Each element leads to O(1) map lookups and updates.

Space Complexity: O(m), where m = number of distinct elements.
The hash map stores one entry per distinct value.
*/