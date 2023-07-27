import java.util.stream.Stream;

public class Randomizer {
        public static Stream<Long> generator(long a, long c, long m, long seed) {
            return Stream.iterate(seed, x -> (a * x + c) % m);
    }
        public static void main(String[] args) {
            long a = 25214903917L;
            long c = 11L;
            long m = (long) Math.pow(2,48);
            long seed = 30L;

            Stream<Long> randomStream = generator(a, c, m, seed);

            randomStream.limit(20).forEach(System.out::println);
    }
}
