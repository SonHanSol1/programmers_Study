package com.ll.level0.p120845;

//https://school.programmers.co.kr/learn/courses/30/lessons/120845
// 주사위의 개수

public class Main {

}

// TODO (box[0]/n) * (box[1]/n) * (box[2]/n) = 상자에 들어갈 수 있는 주사위 갯수
class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        answer = (box[0]/n) * (box[1]/n) * (box[2]/n);
        return answer;
    }
}