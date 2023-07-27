import java.util.Iterator;
import java.util.stream.Stream;

public class MixerIterator {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Stream.Builder<T> builder = Stream.builder();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            builder.accept(firstIterator.next());
            builder.accept(secondIterator.next());
        }

        return builder.build();
    }
    public static void main(String[] args) {
        Stream<String> firstStream = Stream.of("Ivan1", "John1", "Peter1", "Alex1", "Vova1");
        Stream<String> secondStream = Stream.of("Ivan2", "John2", "Peter2");

        Stream<String> mixedStream = zip(firstStream, secondStream);
        mixedStream.forEach(System.out::println);
    }
}