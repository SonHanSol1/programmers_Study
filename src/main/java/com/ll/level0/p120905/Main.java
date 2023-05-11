package com.ll.level0.p120905;


//https://school.programmers.co.kr/learn/courses/30/lessons/120905
// n의 배수 고르기

import java.util.ArrayList;

public class Main {

}
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i : numlist){
            if (i % n == 0) {
                temp.add(i);
            }
        }
        // 리스트 배열로 변환
        int[] answer = temp.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
/*
class Solution {
    public int[] solution(int n, int[] numList) {
        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
    }
}



 */