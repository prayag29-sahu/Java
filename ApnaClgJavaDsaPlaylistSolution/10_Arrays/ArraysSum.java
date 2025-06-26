import java.util.*;
public class ArraysSum {
    public static ArrayList<Integer> addArrays(ArrayList<Integer> A, ArrayList<Integer> B) {
        int sizeOfA = A.size();

        int sizeOfB = B.size();

        int maxSize = Math.max(sizeOfA, sizeOfB);

        ArrayList<Integer> addArray = new ArrayList<>(Collections.nCopies(maxSize, 0));

        int carry = 0;

        int indexOfA = sizeOfA - 1;

        int indexOfB = sizeOfB - 1;

        int iteration = maxSize - 1;

        while (iteration >= 0) {

            int sum = carry;

            if (indexOfA >= 0)
                sum += A.get(indexOfA--);

            if (indexOfB >= 0)
                sum += B.get(indexOfB--);

            carry = sum / 10;

            addArray.set(iteration--, sum % 10);

        }

        if (carry != 0) {

            ArrayList<Integer> addArrayWithCarry = new ArrayList<>(maxSize + 1);

            addArrayWithCarry.add(carry);

            addArrayWithCarry.addAll(addArray);

            return addArrayWithCarry;

        }

        return addArray;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        A.add(2);
        A.add(20);
        A.add(12);
        A.add(24);
        A.add(32);
        A.add(27);
        B.add(32);
        B.add(62);
        B.add(22);
        B.add(42);
        B.add(2);
        System.out.println(addArrays(A, B));
    }
}
/*
[7, 9, 9, 3, 6, 9]
 */