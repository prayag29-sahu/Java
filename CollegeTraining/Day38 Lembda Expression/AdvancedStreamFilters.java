
import java.util.*;
import java.util.stream.*;

public class AdvancedStreamFilters {
    public static void main(String[] args) {
        List<Integer> newList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        int finalAns = newList.stream()
            .filter(n -> n > 2)
            .filter(n -> n % 2 == 0)
            .reduce(0, (a, b) -> a + b);

        int maxValue = newList.stream().reduce(0, Integer::max);
        int minValue = newList.stream().reduce(Integer.MAX_VALUE, Integer::min);

        List<Integer> finalAns2 = newList.stream().filter(n -> n != 7).collect(Collectors.toList());

        System.out.println("Sum of even numbers > 2: " + finalAns);
        System.out.println("Max Value: " + maxValue);
        System.out.println("Min Value: " + minValue);
        System.out.println("List without 7: " + finalAns2);
    }
}

/*
Sum of even numbers > 2: 40
Max Value: 12
Min Value: 0
List without 7: [0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12]
 */