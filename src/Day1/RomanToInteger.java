package Day1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(romanToInt(str));
    }



    public static int romanToInt(String s) {

        int sum = 0;
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            int b = getValue(s.charAt(i));
            if (b > a) {
                sum -= (2 * a);
            }
            sum += b;
            a = b;
        }

        return sum;
    }

    public static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}

