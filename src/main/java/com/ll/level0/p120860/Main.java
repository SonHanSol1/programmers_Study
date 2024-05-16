package com.ll.level0.p120860;

// https://school.programmers.co.kr/learn/courses/30/lessons/120860
// 직사각형 넓이 구하기

import static java.lang.Math.abs;

public class Main {

}
//class Solution {
//    public int solution(int[][] dots) {
//        int answer = 0;
//        int maxWidth = dots[0][0];
//        int maxH = dots[0][1];
//        int minW = dots[0][0];
//        int minH = dots[0][1];
//        for(int i = 0; i < dots.length; i++){
//            maxW = Math.max(maxW, dots[i][0]);
//            maxH = Math.max(maxH, dots[i][1]);
//            minW = Math.min(minW, dots[i][0]);
//            minH = Math.min(minH, dots[i][1]);
//        }
//        answer = (maxW - minW) * (maxH - minH);
//        return answer;
//    }
//}
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int tmp = dots[0][0];
        int tmp2 = 0;
        int tmp3 = 0;
        for(int i = 1; i<dots.length; i++){
            if(dots[i][0] == tmp){
                tmp2 = Math.abs(dots[i][1] - dots[0][1]);
            }else{
                tmp3 = Math.abs(dots[i][0] - dots[0][0]);
            }
        }
        answer = tmp2 * tmp3;
        return answer;
    }
}
