
import java.util.*;
import java.util.stream.*;

public class StreamOperations1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 12, 19, 23, 28);

        List<Integer> evenList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> multiply = list.stream().map(n -> n * 5).collect(Collectors.toList());
        List<Integer> evenListThenMultiply = list.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * 5)
            .collect(Collectors.toList());

        System.out.println("Even List: " + evenList);
        System.out.println("Multiplied List: " + multiply);
        System.out.println("Even then Multiplied: " + evenListThenMultiply);
    }
}

/*
Even List: [10, 12, 28]
Multiplied List: [25, 50, 60, 95, 115, 140]
Even then Multiplied: [50, 60, 140]
 */