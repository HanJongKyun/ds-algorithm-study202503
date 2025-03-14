package string;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] revers_input = new String[num];

        for (int i = 0; i < num; i++) {
            String input = scan.next();
            revers_input[i] = new StringBuilder(input).reverse().toString();
        }

        for (int i = 0; i < num; i++) {
            System.out.println(revers_input[i]);
        }
        scan.close();
    }
}

