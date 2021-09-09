import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number do you want to read? ");
        int a = scanner.nextInt();
        int ones = a % 10;
        int modHundreds = a % 100;
        int x = modHundreds / 10;
        int tens = a / 10;
        int hundreds = a / 100;

        String readTens = null;
        String readHundreds = null;
        String readOnes = null;
        String readModHundreds = null;
        String readx = null;

            switch (ones) {
                case (0):
                    readOnes = " ";
                    break;
                case (1):
                    readOnes = "one";
                    break;
                case (2):
                    readOnes = "two";
                    break;
                case (3):
                    readOnes = "three";
                    break;
                case (4):
                    readOnes = "four";
                    break;
                case (5):
                    readOnes = "five";
                    break;
                case (6):
                    readOnes = "six";
                    break;
                case (7):
                    readOnes = "seven";
                    break;
                case (8):
                    readOnes = "eight";
                    break;
                case (9):
                    readOnes = "nine";
                    break;
                case (10):
                    readOnes = "ten";
                    break;
            }

        switch (tens) {
            case (2):
                readTens = "twenty";
                break;
            case (3):
                readTens = "thirty";
                break;
            case (4):
                readTens = "forty";
                break;
            case (5):
                readTens = "fifty";
                break;
            case (6):
                readTens = "sixty";
                break;
            case (7):
                readTens = "seventy";
                break;
            case (8):
                readTens = "eighty";
                break;
            case (9):
                readTens = "ninety";
                break;
        }
        switch (hundreds) {
            case (1):
                readHundreds = "one hundred";
                break;
            case (2):
                readHundreds = "two hundred";
                break;
            case (3):
                readHundreds = "three hundred";
                break;
            case (4):
                readHundreds = "four hundred";
                break;
            case (5):
                readHundreds = "five hundred";
                break;
            case (6):
                readHundreds = "six hundred";
                break;
            case (7):
                readHundreds = "seven hundred";
                break;
            case (8):
                readHundreds = "eight hundred";
                break;
            case (9):
                readHundreds = "nine hundred";
                break;
        }

        switch (x) {
            case (2):
                readx = "twenty";
                break;
            case (3):
                readx = "thirty";
                break;
            case (4):
                readx = "forty";
                break;
            case (5):
                readx = "fifty";
                break;
            case (6):
                readx = "sixty";
                break;
            case (7):
                readx = "seventy";
                break;
            case (8):
                readx = "eighty";
                break;
            case (9):
                readx = "ninety";
                break;
        }

        if (modHundreds == 0)
            readModHundreds = " ";
        if (modHundreds > 0 && modHundreds < 10)
            readModHundreds = "and" + " " + readOnes;
        switch (modHundreds) {
            case (11):
                readModHundreds = "eleven";
                break;
            case (12):
                readModHundreds = "twelve";
                break;
            case (13):
                readModHundreds = "thirteen";
                break;
            case (14):
                readModHundreds = "fourteen";
                break;
            case (15):
                readModHundreds = "fifteen";
                break;
            case (16):
                readModHundreds = "sixteen";
                break;
            case (17):
                readModHundreds = "seventeen";
                break;
            case (18):
                readModHundreds = "eighteen";
                break;
            case (19):
                readModHundreds = "nineteen";
                break;
        }

        if (modHundreds >= 20 && modHundreds < 99)
            readModHundreds = readx + " " + readOnes;


        if (a == 0)
            System.out.printf("The number '%d' has called %s", a, "zero");
        if (a >0 && a < 10)
            System.out.printf("The number '%d' has called %s", a, readOnes);
        if (a >= 10 && a < 20)
            switch (ones) {
                case (0):
                    System.out.printf("The number '%d' has called %s", a, "ten");
                    break;
                case (1):
                    System.out.printf("The number '%d' has called %s", a, "eleven");
                    break;
                case (2):
                    System.out.printf("The number '%d' has called %s", a, "twelve");
                    break;
                case (3):
                    System.out.printf("The number '%d' has called %s", a, "thirteen");
                    break;
                case (4):
                    System.out.printf("The number '%d' has called %s", a, "fourteen");
                    break;
                case (5):
                    System.out.printf("The number '%d' has called %s", a, "fifteen");
                    break;
                case (6):
                    System.out.printf("The number '%d' has called %s", a, "sixteen");
                    break;
                case (7):
                    System.out.printf("The number '%d' has called %s", a, "seventeen");
                    break;
                case (8):
                    System.out.printf("The number '%d' has called %s", a, "eighteen");
                    break;
                case (9):
                    System.out.printf("The number '%d' has called %s", a, "nineteen");
                    break;
            }

        if (a >= 20 && a < 100)
            System.out.printf("The number '%d' has called %s", a, readTens + " " + readOnes);

        if (a >= 100 && a < 1000)
            System.out.printf("The number '%d' has called %s", a, readHundreds + " " + readModHundreds);
    }
}


