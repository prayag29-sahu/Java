public class CountNumOfOccurOfElem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            boolean isCounted = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isCounted = true;
                    break;
                }
            }
            if (!isCounted) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println("The element " + arr[i] + " occurs " + count + " time");
            }
        }
    }
}
/*
The element 1 occurs 2 time
The element 2 occurs 2 time
The element 3 occurs 2 time
The element 4 occurs 1 time
The element 5 occurs 1 time
 */