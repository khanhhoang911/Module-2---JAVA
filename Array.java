package MangTrongJava;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        int choice = scanner.nextInt();
        int count = 0;
        int position;
            System.out.println("Nhập menu");
            System.out.println("1. Thêm phần tử vào mảng");
            System.out.println("2. Sửa phần tử trong mảng");
            System.out.println("3. Xóa phần tử trong mảng");
            System.out.println("4. Chèn phần tử vào mảng vào mảng");
            System.out.println("5. Thoát");

            switch (choice) {
                case 1:
                    System.out.printf("Thêm phần tử arr[%d] = ", count);
                    arr[count] = scanner.nextInt();
                    count++;
                    break;
                case 2:
                    System.out.printf("Nhập vào vị trí cần sửa: ");
                    position = scanner.nextInt();
                    if (position < 0 || position >= count) {
                        System.out.println("Vị trí không có trong mảng ");
                    } else {
                        System.out.printf("arr[%d] = ", position);
                        arr[position] = scanner.nextInt();
                    }
                    break;
                case 3:
                    System.out.println("Nhập vào vị trí cần xóa: ");
                    position = scanner.nextInt();
                    if (position < 0 || position >= count) {
                        System.out.println("Vị trí không có trong mảng ");
                    } else {
                        for (int i = position; i <= count - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        count--;
                        System.out.println("Xóa phần tử tại vị trí %d của mảng");
                    }
                    break;
                case 4:
                    System.out.println("Nhập vào vị trí cần chèn: ");
                    position = scanner.nextInt();
                    if (position < 0 || position >= count) {
                        System.out.println("Vị trí không có trong mảng ");
                    } else {
                        System.out.println("Nhập số cần chèn ");
                        int num = scanner.nextInt();
                        for (int i = count; i > position; i--) {
                            arr[i] = arr[i - 1];
                        }
                        arr[position] = num;
                        count++;
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }

