package array;

import java.util.Arrays;
import java.util.Scanner;

public class DivideArray {
    /*
    1. Create an int Array, size 20
    2. Read numbers from the console and fill in this Array
    3. Create 2 int Arrays, size 10 each
    4. Copy big array into 2 small. First half to the first Array, Second half to the second Array
    5. Print second small array to the console
     */

    public static void main(String[] args) {
        int[] numbers1 = new int[20];
        Scanner input = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = input.nextInt();
        }
        int[] a = new int[20 / 2];
        int[] b = new int[20 - a.length];
        System.arraycopy(array, 0, a, 0, a.length);
        System.arraycopy(array, a.length, b, 0, b.length);
        System.out.println(Arrays.toString(b));
        // implement me
    }
}
