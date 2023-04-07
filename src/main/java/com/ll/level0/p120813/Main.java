package com.ll.level0.p120813;

// https://school.programmers.co.kr/learn/courses/30/lessons/120813
// 짝수는 싫어요

public class Main {
}

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        for(int i=1; i<=n; i++){
            if(i%2==1){
                answer[i/2] = i;
            }
        }
        return answer;
    }
}
/*
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}

 */
