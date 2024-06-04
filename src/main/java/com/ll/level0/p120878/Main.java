package com.ll.level0.p120878;

// https://school.programmers.co.kr/learn/courses/30/lessons/120878
// 유한소수 판별하기

public class Main {

}

class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int gcd = b / gcdRecursive(a, b);
        while (gcd != 1) {
            if (gcd % 2 == 0) {
                gcd /= 2;
            } else if (gcd % 5 == 0) {
                gcd /= 5;
            } else {
                return 2;
            }
        }
        return answer;
    }

    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
    }
}