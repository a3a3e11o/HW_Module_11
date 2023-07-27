import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mixer {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.toList();
        List<T> secondList = second.toList();

        int minSize = Math.min(firstList.size(), secondList.size());

        return IntStream.range(0, minSize)
                .mapToObj(i -> Stream.of(firstList.get(i), secondList.get(i)))
                .flatMap(s -> s);
    }

    public static void main(String[] args) {
        Stream<String> firstStream = Stream.of("Ivan1", "John1", "Peter1", "Alex1", "Vova1");
        Stream<String> secondStream = Stream.of("Ivan2", "John2", "Peter2");

        Stream<String> mixedStream = zip(firstStream, secondStream);
        mixedStream.forEach(System.out::println);
    }
}


