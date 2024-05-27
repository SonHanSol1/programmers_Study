package com.ll.level0.p120871;

// https://school.programmers.co.kr/learn/courses/30/lessons/120871
// 저주의 숫자 3

public class Main {

}
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        answer = n;
//        for(int i = 0; i < answer; i++){
//            if(i%3==0 || i%10==3 || i/10 == 3 || (i%100)/10==3){
//                // n++;
//                answer++;
//            }
//        }
//        return answer-1;
//    }
//}
class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                i--;
            }
        }

        return answer;
    }
}