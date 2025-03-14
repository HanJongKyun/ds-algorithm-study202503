package string;

import java.util.Scanner;

public class Solution6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = str.split(" ");
        String s = arr[0];
        char t = arr[1].charAt(0);

        int[] result = new int[s.length()]; // 거리를 숫자로 담을 배열
        int p = 100; // 거리 비교를 위해 선언한 변수 (0으로 초기화하면 안됨! 0은 찾고자 하는 문자와 같다는 의미)

        // 왼쪽에서 오른쪽으로 거리 계산
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++; // 기존 문자가 아니라면 이전 문자와의 거리 + 1
            }
            result[i] = p;
        }

        // 오른쪽에서 왼쪽으로 거리 계산
        p = 100;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++; // 기존 문자가 아니라면 이전 문자와의 거리 + 1
            }
            // 위에서 계산한 결과와 비교해서 더 작은 값으로 할당하기
            result[i] = Math.min(result[i], p);
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
        scan.close();
    }
}
