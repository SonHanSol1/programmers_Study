package com.ll.level0.p120891;

//https://school.programmers.co.kr/learn/courses/30/lessons/120891
// 369게임

public class Main {

}
class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] clap = {'3','6','9'};
        String orderStr = String.valueOf(order);

        char[] charArray = orderStr.toCharArray();
        for (char c : charArray) {
            for (char value : clap) {
                if (c == value) {
                    answer++;
                }
            }
        }

//        for(int i = 0; i < orderStr.length(); i++)
//        {
//            char c = orderStr.charAt(i);
//            if(c=='3'||c=='6'||c=='9')
//            {
//                answer++;
//            }
//        }

        return answer;
    }
}