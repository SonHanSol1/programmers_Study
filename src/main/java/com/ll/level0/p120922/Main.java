package com.ll.level0.p120922;

// https://school.programmers.co.kr/learn/courses/30/lessons/120922
// 종이 자르기

public class Main {

}
class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        if(M * N > 1){
            answer = M * N - 1;
        }
        return answer;
    }
}
//class Solution {
//    public int solution(int M, int N) {
//        int answer = 0;
//        answer = M*N-1;
//        return answer;
//    }
//}
