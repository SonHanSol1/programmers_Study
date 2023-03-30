package com.ll.level0.p120824;

// https://school.programmers.co.kr/learn/courses/30/lessons/120824
// 짝수 홀수 개수

import java.util.Arrays;

public class Main {

}
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i : num_list){
            if(i%2==0){
                answer[0]+=1;
            }
            else{
                answer[1] += 1;
            }
        }
        return answer;
    }
}

/*
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }
}

 */