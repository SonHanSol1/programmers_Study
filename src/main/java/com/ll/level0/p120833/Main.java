package com.ll.level0.p120833;

import java.util.Arrays;
//https://school.programmers.co.kr/learn/courses/30/lessons/120833
// 배열 자르기

public class Main {

}
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = Arrays.copyOfRange(numbers,num1, num2+1);
        return answer;
    }
}