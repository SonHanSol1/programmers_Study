package com.ll.level0.p120811;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/120811
// 중앙값 구하기
public class Main {

}

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length/2];
        return answer;
    }
}

/*
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length >> 1];
    }
}
// 시프트 연산으로 나누기 2 구현
 */