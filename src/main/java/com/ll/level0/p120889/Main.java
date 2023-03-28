package com.ll.level0.p120889;

// https://school.programmers.co.kr/learn/courses/30/lessons/120889
// 삼각형의 완성조건 (1)

import java.util.Arrays;

public class Main {

}
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if(sides[2] < sides[0]+sides[1]){
            answer = 1;
        }
        else{
            answer = 2;
        }
        return answer;
    }
}

/*
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        return sides[2] >= sides[0]+sides[1] ? 2 : 1;
    }
}

 */