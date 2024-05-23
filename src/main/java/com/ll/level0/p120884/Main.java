package com.ll.level0.p120884;

// https://school.programmers.co.kr/learn/courses/30/lessons/120884
// 치킨 쿠폰

public class Main {

}

class Solution {
    public int solution(int chicken) {
        int answer = 0;
        double coupon = chicken;
        while (chicken > 0) {
            coupon += (double) chicken / 10;
            chicken /= 10;
        }

        answer = (int) coupon / 10;

        return answer;
    }
}

//class Solution {
//    public int solution(int chicken) {
//        int answer = 0;
//        while (chicken >= 10){
//            int service = chicken / 10;
//            int nmg = chicken %  10;
//
//            chicken = service + nmg;
//
//            answer += service;
//
//        }
//
//
//        return answer;
//    }
//}

//class Solution {
//    public int solution(int chicken) {
//        int answer = chicken/9;
//        if(chicken>1&&chicken%9==0){
//            answer--;
//        }
//
//        return answer;
//    }
//}