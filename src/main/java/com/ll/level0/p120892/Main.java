package com.ll.level0.p120892;

//https://school.programmers.co.kr/learn/courses/30/lessons/120892
// 암호 해독

public class Main {

}
// 리펙토링
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = code; i<=cipher.length(); i+=code){
            answer += String.valueOf(cipher.charAt((i)-1));
        }
        return answer;
    }
}


/*
// 1차 시도
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i =1; i*code<=cipher.length(); i++){
            answer += String.valueOf(cipher.charAt((code*i)-1));
        }
        return answer;
    }
}
// 예
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";

        for (int i = code; i <= cipher.length(); i = i + code) {
            answer += cipher.substring(i - 1, i);
        }

        return answer;
    }
}
 */