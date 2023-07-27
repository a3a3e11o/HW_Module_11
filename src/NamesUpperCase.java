import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NamesUpperCase {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "John", "Peter", "Alex", "Vova");

        String result = names.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
