package com.ll.level0.p120882;

// https://school.programmers.co.kr/learn/courses/30/lessons/120882
// 등수 매기기

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

}
//class Solution {
//    public int[] solution(int[][] score) {
//        int[] answer = new int[score.length];
//        int[] num = new int[score.length];
//        for(int i = 0; i < score.length; i++){
//            num[i] = score[i][0] + score[i][1];
//            answer[i] = 1;
//        }
//        for(int x = 0; x < answer.length; x++){
//            for(int y = 0; y < answer.length; y++){
//                if(num[x]<num[y]){
//                    answer[x]++;
//                }
//            }
//        }
//        return answer;
//    }
//}
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Integer> scoreList = new ArrayList<>();
        for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        for(int i = 0; i < score.length; i++){
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
        }
        return answer;
    }
}
