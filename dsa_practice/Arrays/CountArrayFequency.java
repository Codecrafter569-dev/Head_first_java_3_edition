import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class CountArrayFequency{
	public static void main(String args[]){
		int[] data = {3,5,6,3,6};
		System.out.println("Arrays :"+Arrays.toString(data));
		 Map<Integer, Integer> frequencies = countFequency(data);
		for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
	}
	public static Map<Integer,Integer> countFequency(int[] arr){
		Map<Integer,Integer> fequnMap = new HashMap<>();
		
		for(int x : arr){
			fequnMap.put(x,fequnMap.getOrDefault(x,0)+1);
		}
		return fequnMap;
	}
	
}
/*
int[] arr = {3,5,6,3,6};
Map = {};

x = 3 :
if x = 3 is already in map then count +1 and if No only assine 1. -> No
Map{3 == 1 };

X = 5 :
if x = 5 is already in map then count +1 and if No only assine 1. -> No
Map{ 3 == 1 , 5 == 1};

x = 6 :
if x = 6 is already in map then count +1 and if No only assine 1. -> NO
Map = { 3 == 1,5 == 1,6 == 1};

x = 3 :
if x = 3 is already in map then count +1 and if No only assine 1. -> yes
Map = { 3 == 2,5 == 1,6 == 1}; now 3 has a value is 2.

x = 6 :
if x = 6 is already in map then count +1 and if No only assine 1. -> yes
Map = { 3 == 2,5 == 1,6 == 2}; now 6 has a value is 2.


now our final Answer
  3 == 2, (that means 3 appers 2 times)
  5 == 1, (that means 5 appers 1 times)
  6 == 2, (that means 6 appers 2 times)




4. Complexity Analysis

Time Complexity: O(n), where n = number of elements.
Each element is looked up and updated once in the hash map.

Space Complexity: O(m), where m = number of distinct elements.
The map stores one entry per distinct value.

*/