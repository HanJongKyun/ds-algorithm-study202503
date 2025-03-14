package string;

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        StringBuilder result = new StringBuilder();

        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) { // 마지막 문자는 따로 처리
            if (str.charAt(i) == str.charAt(i + 1)) { // 연속된 문자일 경우
                cnt++;
            } else { // 연속된 문자 x
                result.append(str.charAt(i)); // 문자 추가
                if (cnt > 1) {
                    result.append(cnt); // 반복 횟수가 1보다 클 때만 숫자 추가
                }
                cnt = 1;
            }
        }

        // 마지막 문자 처리 반복 횟수를 추가
        result.append(str.charAt(str.length() - 1));
        if (cnt > 1) {
            result.append(cnt);
        }

        System.out.println(result);
    }
}
