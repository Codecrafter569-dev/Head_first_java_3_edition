import java.util.*;
import java.util.stream.*;

public class OptionalClass12{
public static void main(String args[]){
List<String> names = Arrays.asList("john","Alica","Bob");

Optional<String> longestName = names.stream()
.max(Comparator.comparingInt(String :: length));
longestName.ifPresent(System.out::println);
}
}