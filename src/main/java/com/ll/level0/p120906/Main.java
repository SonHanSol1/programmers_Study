package com.ll.level0.p120906;

// https://school.programmers.co.kr/learn/courses/30/lessons/120906
// 자릿수 더하기


public class Main {
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n!=0){
            answer += n%10;
            n = n/10;
        }
        return answer;
    }
}

/*
class Solution {
    public int solution(int n) {
        int answer = 0;
        String strNum = Integer.toString(n);
        for(int i = 0; i < strNum.length(); i++){
            answer += n%10;
            n = n/10;
        }
        return answer;
    }
}


import java.util.Arrays;

class Solution {
   public int solution(int n) {
        String[] split = String.valueOf(n).split("");
        return Arrays.stream(split).mapToInt(Integer::parseInt).sum();
    }
}
 */