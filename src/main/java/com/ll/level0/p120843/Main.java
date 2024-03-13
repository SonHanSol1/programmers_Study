package com.ll.level0.p120843;

//https://school.programmers.co.kr/learn/courses/30/lessons/120843
// 공 던지기

public class Main {

}

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        answer = numbers[((1 + ((k - 1) * 2)) % numbers.length) - 1];
        return answer;
    }
}