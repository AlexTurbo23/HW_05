package array;

import java.util.Scanner;

public class TwoArrays {
    /*
    1. Create an Array of Strings, size 10
    2. Create an Array of int, size 10
    3. Read from the console and fill in the Array with Strings
    4. Fill in the int Array with length of Strings from the first Array.
        If the first element contains "Hello", we put in the first element of int Array - 5
    5. Print the int Array to the console
     */
    public static void main(String[] args) {
        //implement me
        Scanner sc = new Scanner(System.in);

        String str[] = new String[10];
        int leng[] = new int[10];
        for(int i=0;i<10;i++)
        {
            String s = sc.nextLine();
            str[i]=s;
            leng[i] = str[i].length();
        }

        for(int i=0;i<10;i++){
            System.out.print(leng[i]+" ");
        }
    }
}
