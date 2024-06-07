package com.ll.level0.p120921;

//https://school.programmers.co.kr/learn/courses/30/lessons/120921
// 문자열 밀기

public class Main {

}
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        B += B;
        answer = B.indexOf(A);
        return answer;
    }
}

//class Solution {
//    public int solution(String A, String B) {
//        String tempB = B.repeat(3);
//        return tempB.indexOf(A);
//    }
//}