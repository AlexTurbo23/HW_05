package array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class MaxOf20 {
    /*
    1. In the method initializeArray():
    1.1. Create an Array - size 20
    1.2. Read numbers from the console and fill in this array
    2. Method max(int[] array) should find max number from elements of an array
     */

    public static void main(String[] args) {
        int[] array = initializeArray();
        int maxNumber = max(array);
        System.out.println(maxNumber);
    }

    private static int[] initializeArray() {
        // implement me
        Scanner input = new Scanner(System.in);
        int array[] = new int[20];
        System.out.println("Insert array elements:");
        for (int i = 0; i < 19; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    private static int max(int[] array) {
        Arrays.sort(array);
        int m =array[19];
        // implement me
        return m;
    }
}
