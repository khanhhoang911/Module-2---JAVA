package VongLapTrongJava;

import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int length1;
                    int width1;
                    System.out.print("Enter the length of the rectangle:");
                    length1 = scanner.nextInt();
                    System.out.println("Enter the width of the rectangle:");
                    width1 = scanner.nextInt();
                    for (int i = 1; i <= width1; i++) {
                        for (int j = 1; j <= length1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    int side1;
                    System.out.println("Enter the side of the triangle:");
                    side1 = scanner.nextInt();
                    for (int i = 1; i <= side1; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    int side2;
                    System.out.println("Enter the side of the triangle:");
                    side2 = scanner.nextInt();
                    for (int i = side2; i >=1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}