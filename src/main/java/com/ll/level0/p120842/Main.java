package com.ll.level0.p120842;

//https://school.programmers.co.kr/learn/courses/30/lessons/120842
// 2차원으로 만들기

public class Main {

}
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        answer = new int[num_list.length/n][n];
//        int count = 0;
//        for(int i = 0; i < answer.length; i++)
//        {
//            for(int j = 0; j < answer[i].length; j++, count++)
//            {
//                answer[i][j] = num_list[count];
//            }
//        }
        for(int i = 0; i < num_list.length; i++)
        {
            answer[i/n][i%n] = num_list[i];
        }
        return answer;
    }
}