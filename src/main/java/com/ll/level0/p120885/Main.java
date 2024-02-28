package com.ll.level0.p120885;

//https://school.programmers.co.kr/learn/courses/30/lessons/120885
// 이진수 더하기

public class Main {

}
//class Solution {
//    public String solution(String bin1, String bin2) {
//        String answer = "";
//        int total = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
//        answer = Integer.toBinaryString(total);
//        return answer;
//    }
//}
class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        long num1 = 0, num2 = 0, sum = 0;

        long cnt = 1;
        for (int i = bin1.length() - 1; i >= 0; i--) {
            num1 += Long.parseLong(bin1.charAt(i) + "") * cnt;
            cnt *= 2;
        }

        cnt = 1;
        for (int i = bin2.length() - 1; i >= 0; i--) {
            num2 += Long.parseLong(bin2.charAt(i) + "") * cnt;
            cnt *= 2;
        }

        sum = num1 + num2;
        while (sum >= 1) {
            answer = sum % 2 + answer;
            sum /= 2;
        }

        return (answer == "" ? answer = "0" : answer);
    }
}

