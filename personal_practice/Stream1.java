
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Stream1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> strings = List.of("I","am","a","list","of","String");


List<String> str =strings.stream() 
                         .sorted((s1,s2) -> s1.compareToIgnoreCase(s2))
                         .skip(1)
                         .limit(4)
                         .collect(Collectors.toList());
System.out.println(str);
System.out.println(strings);
	}

}
