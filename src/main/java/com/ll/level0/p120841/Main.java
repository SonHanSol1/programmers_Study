package com.ll.level0.p120841;
//https://school.programmers.co.kr/learn/courses/30/lessons/120841
// 점의 위치 구하기

public class Main {
}
class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0 && dot[1] > 0){
            return 1;
        }
        else if(dot[0] < 0 && dot[1] > 0){
            return 2;
        }
        else if(dot[0] < 0 && dot[1] < 0){
            return 3;
        }
        else if(dot[0] > 0 && dot[1] < 0){
            return 4;
        }
        return answer;
    }
}

/*

class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0)
            if(dot[1] > 0) answer = 1;
            else answer = 4;
        else
            if(dot[1] > 0) answer = 2;
            else answer = 3;
        return answer;
    }
}
 */