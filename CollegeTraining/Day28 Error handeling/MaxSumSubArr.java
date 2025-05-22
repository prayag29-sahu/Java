public class MaxSumSubArr {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, -1, 0, 4 };
        int sum = 15;
        try {
            for (int i = 0; i < -arr.length; i++) {
                // if we not use - sign in arr length the o/p was { {5,6,4}
                //                                             hello }
                for (int j = i + 1; j <= arr.length; j++) {
                    for (int k = j + 1; k < arr.length+6; k++) {
                        // if we not add 6 in arr length the o/p was { {5,6,4}
                        //                                             hello }
                        if (arr[i] + arr[j] + arr[k] == sum) {
                            sum = arr[i] + arr[j] + arr[k];
                            System.out.println("{" + arr[i] + "," + arr[j] + "," + arr[k] + "}");
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Its work after exeption handeling ");
    }
}

// Its work after exeption handeling 