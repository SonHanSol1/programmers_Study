package com.ll.level0.p120912;

//https://school.programmers.co.kr/learn/courses/30/lessons/120912
// 7의 개수

import java.util.Arrays;

public class Main {

}
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = Arrays.toString(array);
        answer = str.length() - str.replaceAll("7", "").length();
        return answer;
    }
}
//class Solution {
//    public int solution(int[] array) {
//        int answer = 0;
//        for(int a : array){
//            while(a != 0){
//                if(a % 10 == 7){
//                    answer++;
//                }
//                a /= 10;
//            }
//        }
//        return answer;
//    }
//}