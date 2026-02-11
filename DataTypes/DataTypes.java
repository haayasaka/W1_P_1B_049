package DataTypes;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int test_case = 0;
        Scanner input = new Scanner(System.in);
        String[] N;
        test_case = Integer.parseInt(input.nextLine());
        N = new String[test_case];

        for (int i = 0; i < test_case; i++) {
            N[i] = input.nextLine();
        }

        for (int i = 0; i < test_case; i++) {
            long num = 0;
            boolean convertable = true;

            try {
                num = Long.parseLong(N[i]);
            } catch (NumberFormatException e) {
                System.out.println(N[i] + " can't be fitted in any");
                convertable = false;
            }
            if (convertable == true) {
                System.out.println(N[i] + " can be fitted in:");
                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            }
        }
        input.close();
    }
}
