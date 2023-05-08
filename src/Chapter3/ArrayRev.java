package Chapter3;

import java.util.Arrays;

public class ArrayRev {
    public static void main(String[] args) {
        int[] number = {10, 12, 3, 4};
        int[] secondNumber = new int[4];
        int count = number.length;
        for (int i = 0; i < number.length ; i++) {
            count--;
            secondNumber[i] = number[count];
        }
        System.out.println(Arrays.toString(secondNumber));
    }
}
