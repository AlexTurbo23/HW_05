package array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    /*
    1. Create an Array, of 10 String elements
    2. Input from the console 8 Strings and save them to the array
    3. Print to the console (10 elements) in reverse order. Each element from new line
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str[] = new String[10];

        for(int i=0;i<8;i++)
        {
            String s = sc.nextLine();
            str[i]=s;
        }

        for(int i=9;i>=0;i--){
            System.out.println(str[i]);
    }
        //implement me
    }

}
