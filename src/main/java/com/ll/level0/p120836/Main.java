package com.ll.level0.p120836;

// https://school.programmers.co.kr/learn/courses/30/lessons/120836
// 순서쌍의 개수
public class Main {
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                answer++;
            }
        }
        return answer;
    }
}