package string;

import java.util.Scanner;

public class Solution5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        input = input.toUpperCase().replaceAll("[^A-Z]", "");

        String rs = new StringBuilder(input).reverse().toString();
        String answer = "NO";
        if(input.equals(rs)){
            answer = "YES";
        }

        System.out.print(answer);
    }
}
