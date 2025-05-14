// class MissingNumInSequ {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 5, 6, 7};
        
//         for (int i = 0; i < arr.length - 1; i++) {
//             if (arr[i + 1] - arr[i] != 1) {
//                 System.out.println("Missing number : " + (arr[i] + 1));
//                 break; // when only one number is missing
//             }
//         }
//     }
// }
// // Missing number : 4


class MissingNumInSequ {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 9}; // when multiple missing numbers

        for (int i = 0; i < arr.length - 1; i++) {
            int current = arr[i];
            int next = arr[i + 1];
            if (next - current > 1) {
                for (int j = current + 1; j < next; j++) {
                    System.out.println("Missing number: " + j);
                }
            }
        }
    }
}
/*
Missing number: 4
Missing number: 5
Missing number: 7
Missing number: 8
 */