import java.util.*;
public class FactoryMethod{
 public static void main(String args[]){
List<String> strings = List.of("can I"," Take",
" a"," pen"," with you","I will","go");
System.out.println(strings);

Set<Integer> sets = Set.of(45,67,876,452,6543,3);
sets= Set.of(1231); //we can do that ,but we can't do that -> sets.add(4848);
System.out.println(sets);
Map<Integer,Float> maps = Map.ofEntries(Map.entry(1223,453.34f),Map.entry(124,12.5343f),
Map.entry(45,876.456f),Map.entry(12342,456.3453f));
System.out.println(maps);
}

}