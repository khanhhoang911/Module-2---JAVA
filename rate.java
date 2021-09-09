import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueByUSD;
        System.out.println("Enter a value by USD: ");
        valueByUSD = scanner.nextInt();
        int valueByVND;
        valueByVND = valueByUSD * 23000;
        System.out.printf("Value by VND is: %d", valueByVND);
    }
}
