package com.ll.level0.p120819;

// https://school.programmers.co.kr/learn/courses/30/lessons/120819
// 아이스 아메리카노

public class Main {

}
class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money%5500;
        return answer;
    }
}

/*
class Solution {
    public int[] solution(int money) {
        return new int[] { money / 5500, money % 5500 };
    }
}
 */