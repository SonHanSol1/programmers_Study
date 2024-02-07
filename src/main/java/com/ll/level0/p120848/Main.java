package com.ll.level0.p120848;

//https://school.programmers.co.kr/learn/courses/30/lessons/120848
// 팩토리얼

public class Main {

}
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        int num = 1;
//        for(int i = 1; i <= n+1; i++) {
//            num *= i;
//            if(num > n) {
//                answer = i - 1;
//                break;
//            }
//        }
//        return answer;
//    }
//}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        int i = 0;
        while (true) {
            if (num <= n) {
                num *= i + 1;
                ++i;
            } else {
                answer = i - 1;
                break;
            }
        }
        return answer;
    }
}