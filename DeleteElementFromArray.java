package MangTrongJava;

import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        int i, index;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        array = new int[size];

        for (i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int j = 0; j < size; j++) {
            System.out.println("Array List: " + array[j]);
        }

        System.out.println("Enter a number to find which in the array: ");
        int X = scanner.nextInt();
        for (index = i = 0; i < size; i++) {
            if (array[i] != X) {
                array[index] = array[i];
                index++;
            }
        }
        size = index;
        System.out.println("New array is: ");
        for (i = 0; i < size; i++) {
            System.out.print(array[i]);
        }
    }
}
