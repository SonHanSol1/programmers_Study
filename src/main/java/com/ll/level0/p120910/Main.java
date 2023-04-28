package com.ll.level0.p120910;

//https://school.programmers.co.kr/learn/courses/30/lessons/120910
// 세균 증식

public class Main {

}
class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for(int i=1; i <= t; i++){
            answer = answer*2;
        }
        return answer;
    }
}

/*
class Solution {
    public int solution(int n, int t) {
        int answer = 0;

        answer = n << t;

        return answer;
    }
}
 */
