import java.util.Arrays;
import java.util.stream.Collectors;

public class Array {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};

        String result = Arrays.stream(array)
                .flatMap(item -> Arrays.stream(item.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}