// 16. Find duplicate number in array

public class FindDuplecate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            boolean check = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    check = true;
                    break;
                }
            }
            if (check==false) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println("The Duplecate element was : " + arr[i] );
                        break;
                    }
                }
            }
        }
    }
}
/*
The Duplecate element was : 1
The Duplecate element was : 2
The Duplecate element was : 3
 */