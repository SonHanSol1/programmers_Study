package com.ll.level0.p120825;

// https://school.programmers.co.kr/learn/courses/30/lessons/120825
// 문자 반복 출력하기

public class Main {
}
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i =0;i<my_string.length(); i++){
            for(int j=0; j<n; j++){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
/*
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);
        }
        return answer;
    }
}

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
}
 */