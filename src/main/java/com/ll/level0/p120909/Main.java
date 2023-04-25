package com.ll.level0.p120909;

// https://school.programmers.co.kr/learn/courses/30/lessons/120909
// 제곱수 판별하기

public class Main {

}
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i =0; i * i <= n; i++){
            if(i*i == n){
                answer = 1;
            }
            else{
                answer = 2;
            }
        }
        return answer;
    }
}
/*
class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % Math.sqrt(n) == 0) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}

class Solution {
    public int solution(int n) {
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}
 */