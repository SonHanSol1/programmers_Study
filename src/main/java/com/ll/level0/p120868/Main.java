package com.ll.level0.p120868;

//https://school.programmers.co.kr/learn/courses/30/lessons/120868
// 삼각형의 완성조건(2)

import java.util.Arrays;

public class Main {

}
//class Solution {
//    public int solution(int[] sides) {
//        int answer = 0;
//        Arrays.sort(sides);
//        for (int i = 0; i < sides[0] + sides[1]; i++) {
//            if ((sides[0]+sides[1]) >= i && i >= sides[1]) {    // 가장 긴 변 찾기(i)
//                answer++;
//            } else if ((i+sides[0]) > sides[1] && i < sides[1]) {  // 가장 긴 변이 sides[1]로 가정
//                System.out.println(i);
//                answer++;
//            }
//        }
//        return answer;
//    }
//}
//class Solution {
//    public int solution(int[] sides) {
//        int answer = 0;
//        int count = Math.min(sides[0], sides[1]);
//        answer = count * 2 - 1;
//        return answer;
//    }
//}
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        answer += min * 2 - 1;

        return answer;
    }
}