import java.util.ArrayList;
public class ArrayLists{
public static void main(String args[]){
ArrayList<Integer> myList = new ArrayList<>();
myList.add(45);
int r = 567;
myList.add(r);
myList.add(567);
for(int t : myList){
System.out.print(t+" ");
}
System.out.println("\n"+myList.size());
System.out.println(myList.contains(45));
System.out.println(myList.indexOf(45));
System.out.println(myList.isEmpty());

System.out.println(myList.remove(1) +" is remove"); 
System.out.println(myList.get(1)+"is geted");
myList.remove(0);
myList.remove(0);
System.out.println(myList.isEmpty());
  

}

}