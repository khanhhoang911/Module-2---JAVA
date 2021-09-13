package MangTrongJava;

import java.util.Arrays;
import java.util.Scanner;

public class JoinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = {1, 5, 8};
        int[] arr2 = {3, 7, 12};
        int length = arr1.length + arr2.length;
        int[] result = new int[length];
        int pos = 0;
        for (int i = 0; i < arr1.length; i++) {
            result[pos] = arr1[i];
            pos++;
        }
        for (int j = 0; j < arr2.length; j++) {
            result[pos] = arr2[j];
            pos++;
        }
        System.out.println(Arrays.toString(result));
    }
}
