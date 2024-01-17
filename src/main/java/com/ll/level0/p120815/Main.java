package com.ll.level0.p120815;

// https://school.programmers.co.kr/learn/courses/30/lessons/120815
// 피자 나눠 먹기(2)

public class Main {

}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(i * 6 % n == 0){
                answer = i;
                break;
            }
        }
//        int piece = 0;
//        for (int i = 1; i <= 100; i++) {
//            if(n%n == 0){
//                piece += n;
//                if (piece % 6 == 0) {
//                    answer = piece / 6;
//                    break;
//                }
//            }
//
//        }
        return answer;
    }
}
