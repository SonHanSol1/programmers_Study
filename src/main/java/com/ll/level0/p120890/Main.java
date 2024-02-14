package com.ll.level0.p120890;

//https://school.programmers.co.kr/learn/courses/30/lessons/120890
// 가까운 수

import java.util.Arrays;

public class Main {

}
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            int min = Math.abs(array[0] - n);
            int currentNum = Math.abs(array[i] - n);
            if(min > currentNum){
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;
    }
}