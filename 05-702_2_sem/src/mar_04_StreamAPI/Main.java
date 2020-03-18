package mar_04_StreamAPI;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream
                .iterate(0, x -> x + 1)
                .filter(Main::isPrime)
                .limit(1000)
                .forEach(System.out::println);

    }

    public static boolean isPrime(int a) {
        double n = Math.sqrt(a);
        if (a == 1) return true;
        if (a == 2) return true;
        if (a % 2 == 0) {
            return false;
        }
        for (int i = 3; i < n; i += 2) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }


}
