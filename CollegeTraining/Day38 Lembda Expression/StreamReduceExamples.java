
import java.util.*;

public class StreamReduceExamples {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 12, 19, 23, 28);

        Optional<Integer> ans = list.stream().reduce((a, b) -> a + b);
        System.out.println("Sum using reduce : " + ans);

        int sum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum using reduce : " + sum);
    }
}
/*
Sum using reduce : Optional[97]
Sum using reduce : 97
 */