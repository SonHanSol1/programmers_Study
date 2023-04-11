package com.ll.level0.p120818;

// https://school.programmers.co.kr/learn/courses/30/lessons/120818
// 옷가게 할인 받기

public class Main {
}
class Solution {
    public int solution(int price) {
        int answer = 0;
        double sale = 0;

        if(price < 300000 && price >= 100000){
            answer = (int) (price * 0.95);
        }
        else if(price >= 300000 && price < 500000){
            answer = (int) (price * 0.9);
        }
        else if(price >= 500000){
            answer = (int) (price * 0.8);
        }
        else{
            return price;
        }
        return answer;
    }
}